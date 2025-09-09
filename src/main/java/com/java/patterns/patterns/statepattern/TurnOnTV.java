package com.java.patterns.patterns.statepattern;

public class TurnOnTV implements State{

    @Override
    public void doAction() {
        System.out.println("turning on tv");
    }
}
