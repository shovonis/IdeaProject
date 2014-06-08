package net.therap.util.input_processor;

import net.therap.domain.Output;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * Created by sharafat on 4/6/14.
 */
public class ProcessInputImpl implements ProcessInput {
    private TreeMap<String, Output> distributedLine = new TreeMap<String, Output>();

    @Override
    public void findCounterAndTotal(String line, String pattern) {
        if (line.contains("PROFILER")) {
            String[] lines = line.split(",");
            String[] fullTimeStamp = lines[0].split(" ");
            String[] onlyTimeHour = fullTimeStamp[1].split(":");
            String hour = onlyTimeHour[0];
            String timeInString;
            try {
                if (line.contains(pattern)) {
                    String[] arrayOfLine = lines[lines.length - 1].split("=");
                   timeInString= arrayOfLine[1].substring(0, arrayOfLine[1].length() - 3);

                    if (!timeInString.equals("")) {
                        int time = Integer.parseInt(timeInString);

                        if (distributedLine.get(hour) == null) {
                            Output output = new Output();
                            output.setCount(1);
                            output.setTotal(time);

                            distributedLine.put(hour, output);
                        } else {
                            Output output = distributedLine.get(hour);
                            output.setTotal(output.getCount() + time);
                            output.setCount(output.getCount() + 1);

                        }
                    }
                } else {
                    return;
                }
            } catch (ArrayIndexOutOfBoundsException ex) {
               // System.err.println("LINE "+line);

            }

        }
    }

    public TreeMap<String, Output> getDistributedLine() {
        return this.distributedLine;
    }
}
