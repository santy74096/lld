package com.java.patterns.patterns.bridgedesignpattern.implementor;

public class WaterBreathe implements BreatheImplementor{
    @Override
    public void breathe() {
        System.out.println("breathe O2 by gills");
    }
}
