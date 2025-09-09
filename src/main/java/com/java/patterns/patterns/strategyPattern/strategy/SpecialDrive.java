package com.java.patterns.patterns.strategyPattern.strategy;

public class SpecialDrive implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Need special drive");
    }
}
