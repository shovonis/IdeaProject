package com.company;

/**
 * Created with IntelliJ IDEA.
 * User: rifatul.islam
 * Date: 4/9/14
 * Time: 11:19 AM
 * To change this template use File | Settings | File Templates.
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOn();
    }
}
