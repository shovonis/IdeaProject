package com.company;

/**
 * Created with IntelliJ IDEA.
 * User: rifatul.islam
 * Date: 4/30/14
 * Time: 10:21 AM
 * To change this template use File | Settings | File Templates.
 */

public class SuperClass {
    public int var;

    SuperClass() {
        System.out.println("constructor");
    }

    static void aVoid() {

    }

    protected void aMethod() throws IllegalArgumentException {
        System.out.println("In super class = " + true);
    }
}
