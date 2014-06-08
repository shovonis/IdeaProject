package net.therap;

import net.therap.util.input_reader.InputReaderImpl;
import net.therap.util.output_writer.OutputWriterImpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

public class LogAnalyzer {

    public static void main(String[] args) {
        String pattern;
        System.out.println("Please give the pattern: ");
        Scanner input = new Scanner(System.in);
        pattern = input.nextLine();
        OutputWriterImpl outputWriter = new OutputWriterImpl();
        InputReaderImpl inputReader = new InputReaderImpl();
        Properties prop = new Properties();
        InputStream inputFromConfig = null;

        long startTime = System.currentTimeMillis();
        try {
            inputFromConfig = new FileInputStream("config.properties");
            prop.load(inputFromConfig);

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (inputFromConfig != null) {
                try {
                    inputFromConfig.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        inputReader.readFromLocalFile(new File(prop.getProperty("input_file")), pattern);
        outputWriter.outputToConsole(inputReader.getProcessInput().getDistributedLine());
        long endTime = System.currentTimeMillis();

        System.out.println("Log analyzer took :" + (endTime - startTime));
    }
}
