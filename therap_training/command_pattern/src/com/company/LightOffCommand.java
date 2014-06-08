package com.company;

/**
 * Created with IntelliJ IDEA.
 * User: rifatul.islam
 * Date: 4/9/14
 * Time: 11:25 AM
 * To change this template use File | Settings | File Templates.
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOff();
    }
}
