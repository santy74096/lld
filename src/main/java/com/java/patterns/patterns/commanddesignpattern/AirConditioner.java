package com.java.patterns.patterns.commanddesignpattern;

public class AirConditioner {

    boolean isAcOn;

    public void on(){
        isAcOn = true;
        System.out.println("AC turned on");
    }

    public void off(){
        isAcOn = false;
        System.out.println("AC turned off");
    }
}
