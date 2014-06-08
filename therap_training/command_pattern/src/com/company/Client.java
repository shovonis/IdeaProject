package com.company;

public class Client {

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();

        Command onCommand = new LightOnCommand(light);
        Command offCommand = new LightOffCommand(light);

        remoteControl.setCommand(onCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(offCommand);
        remoteControl.pressButton();



    }
}
