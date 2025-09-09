package com.java.patterns.patterns.commanddesignpattern;

public class Client {

    public static void main(String[] args) {

        Command onCommand = new OffCommand(new AirConditioner());

        RemoteControl remote = new RemoteControl(onCommand);

        remote.pressButton();
    }
}
