package com.java.patterns.patterns.strategyPattern.vehicle;

import com.java.patterns.patterns.strategyPattern.strategy.DriveStrategy;

public class Buggy extends Vehicle{
    public Buggy(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
