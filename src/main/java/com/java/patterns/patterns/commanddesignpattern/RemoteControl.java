package com.java.patterns.patterns.commanddesignpattern;

public class RemoteControl {

    Command command;

    public RemoteControl(Command command){
        this.command = command;
    }

    public void pressButton(){
        command.command();
    }
}
