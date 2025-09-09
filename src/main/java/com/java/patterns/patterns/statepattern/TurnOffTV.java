package com.java.patterns.patterns.statepattern;

public class TurnOffTV implements State{

    @Override
    public void doAction() {
        System.out.println("turning off TV");
    }
}
