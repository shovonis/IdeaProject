package net.therap.util.input_reader;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: rifatul.islam
 * Date: 4/6/14
 * Time: 11:11 AM
 * To change this template use File | Settings | File Templates.
 */
public interface InputReader {
    public void readFromLocalFile(File file, String pattern);

    public void readFromNetworkFile();


}
