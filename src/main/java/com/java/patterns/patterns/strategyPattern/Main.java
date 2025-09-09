package com.java.patterns.patterns.strategyPattern;

import com.java.patterns.patterns.strategyPattern.strategy.SpecialDrive;
import com.java.patterns.patterns.strategyPattern.vehicle.Buggy;
import com.java.patterns.patterns.strategyPattern.vehicle.Vehicle;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Buggy(new SpecialDrive());
        vehicle.drive();
    }
}
