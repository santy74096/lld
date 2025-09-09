package com.java.patterns.patterns.commanddesignpattern;

public class OnCommand implements Command{

    AirConditioner ac;

    public OnCommand(AirConditioner ac){
        this.ac = ac;
    }

    @Override
    public void command() {
        ac.on();
    }
}
