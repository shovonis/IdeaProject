package net.therap.util.output_writer;

import net.therap.domain.Output;

import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 * User: rifatul.islam
 * Date: 4/6/14
 * Time: 11:46 AM
 * To change this template use File | Settings | File Templates.
 */
public interface OutputWriter {
    public void outputToConsole(TreeMap<String, Output> distributedByHours);
}
