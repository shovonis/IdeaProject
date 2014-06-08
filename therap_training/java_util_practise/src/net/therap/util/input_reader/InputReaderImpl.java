package net.therap.util.input_reader;

import net.therap.domain.Output;
import net.therap.util.input_processor.ProcessInputImpl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: rifatul.islam
 * Date: 4/6/14
 * Time: 11:13 AM
 * To change this template use File | Settings | File Templates.
 */
public class InputReaderImpl implements InputReader {
    ProcessInputImpl inputProcessor = new ProcessInputImpl();
    BufferedReader input = null;
    String aLine;
    private HashMap<String, Output> distributedLine = new HashMap<String, Output>();

    @Override
    public void readFromLocalFile(File file, String pattern) {
        try {
            input = new BufferedReader(new FileReader(file));
            while ((aLine = input.readLine()) != null) {
                inputProcessor.findCounterAndTotal(aLine,pattern);
            }

        } catch (java.io.IOException e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void readFromNetworkFile() {
        //TODO: implement later.
    }

    public ProcessInputImpl getProcessInput() {
        return this.inputProcessor;
    }
}
