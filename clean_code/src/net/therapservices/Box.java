package net.therapservices;

/**
 * Created with IntelliJ IDEA.
 * User: rifatul.islam
 * Date: 5/13/14
 * Time: 12:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class Box {
    private double height;
    private double width;
    private Color color;


    private Box(double height, double width) {
        this.height = height;
        this.width = width;
    }

    private Box(double height, double width, Color color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public static Box createBoxWithColor(double height, double width, Color color) {
        return new Box(height, width, color);
    }

    public static Box createBoxWithoutColor(double height, double width) {
        return new Box(height, width);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Box{" +
                "height=" + height +
                ", width=" + width +
                ", color=" + color +
                '}';
    }
}

