package com.java.patterns.patterns.commanddesignpattern;

public class OffCommand implements Command{

    AirConditioner ac;

    public OffCommand(AirConditioner ac){
        this.ac = ac;
    }

    @Override
    public void command() {
        ac.off();
    }
}
