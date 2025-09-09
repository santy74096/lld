package com.java.patterns.patterns.statepattern;

public class Client {

    public static void main(String[] args) {
        State tvOnState = new TurnOnTV();
        State tvOffState = new TurnOffTV();

        TvContext tvContext = new TvContext();
        tvContext.setState(tvOnState);
        tvContext.doAction();

        tvContext.setState(tvOffState);
        tvContext.doAction();
    }
}
