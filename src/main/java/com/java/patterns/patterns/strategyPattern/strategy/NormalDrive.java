package com.java.patterns.patterns.strategyPattern.strategy;

public class NormalDrive implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Need normal drive");
    }
}
