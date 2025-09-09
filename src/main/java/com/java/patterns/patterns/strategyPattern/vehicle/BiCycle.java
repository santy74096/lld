package com.java.patterns.patterns.strategyPattern.vehicle;

import com.java.patterns.patterns.strategyPattern.strategy.DriveStrategy;

public class BiCycle extends Vehicle{

    public BiCycle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
