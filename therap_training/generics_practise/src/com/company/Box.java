package com.company;

/**
 * Created with IntelliJ IDEA.
 * User: rifatul.islam
 * Date: 4/13/14
 * Time: 9:03 AM
 * To change this template use File | Settings | File Templates.
 */
public class Box<T extends Number & Comparable<T> & InterfaceA> {
    private T dimension;

    public T getDimension() {
        return dimension;
    }

    public void setDimension(T dimension) {
        this.dimension = dimension;
    }

    public <U extends Number> void inspectSomething(U u) {
        System.out.println("u.getClass().getName() = " + u.getClass().getName());
        System.out.println("dimension.getClass().getName() = " + dimension.getClass().getName());
    }
}
