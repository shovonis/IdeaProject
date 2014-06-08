package net.therap.util.output_writer;

import net.therap.domain.Output;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 * User: rifatul.islam
 * Date: 4/6/14
 * Time: 11:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class OutputWriterImpl implements OutputWriter {
    @Override
    public void outputToConsole(TreeMap<String, Output> distributedByHours) {
        System.out.println("Hour \t Count \t Total Time(ms)");
        System.out.println();
        for (Map.Entry entry : distributedByHours.entrySet()) {
            Output output = (Output) entry.getValue();
            String hour = String.format("%-10s", entry.getKey().toString()+":00:00");
            String count = String.format("%-10s", output.getCount());
            String total = String.format("%-10s", output.getTotal());
            System.out.println(""+hour+count+total);
        }
    }
}
