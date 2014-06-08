package com.company;

/**
 * Created with IntelliJ IDEA.
 * User: rifatul.islam
 * Date: 4/8/14
 * Time: 4:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class Box<T extends Number , K extends Number> {
    private T height;
    private T width;

    public Box() {
        this.height = height;
        this.width = width;
    }

    public T getHeight() {
        return height;
    }

    public void setHeight(T height) {
        this.height = height;
    }

    public T getWidth() {
        return width;
    }

    public void setWidth(T width) {
        this.width = width;
    }
}
