package com.java.patterns.patterns.strategyPattern.vehicle;

import com.java.patterns.patterns.strategyPattern.strategy.DriveStrategy;

public class Car extends Vehicle{
    public Car(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
