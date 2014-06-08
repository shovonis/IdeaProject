package com.company;

/**
 * Created with IntelliJ IDEA.
 * User: rifatul.islam
 * Date: 4/9/14
 * Time: 10:16 AM
 * To change this template use File | Settings | File Templates.
 */
public class Util {
    public static <K, V> boolean compare(Pair<K, V> pair1, Pair<K, V> pair2) {
        return pair1.getKey().equals(pair1.getKey()) &&
                pair1.getValue().equals(pair2.getValue());
    }
}
