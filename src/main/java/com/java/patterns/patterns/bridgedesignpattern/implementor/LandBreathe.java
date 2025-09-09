package com.java.patterns.patterns.bridgedesignpattern.implementor;

public class LandBreathe implements BreatheImplementor{
    @Override
    public void breathe() {
        System.out.println("breathe O2 by nose");
    }
}
