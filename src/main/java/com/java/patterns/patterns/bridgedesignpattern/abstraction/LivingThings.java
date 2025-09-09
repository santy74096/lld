package com.java.patterns.patterns.bridgedesignpattern.abstraction;

import com.java.patterns.patterns.bridgedesignpattern.implementor.BreatheImplementor;

public abstract class LivingThings {

    BreatheImplementor breatheImplementor;

    public LivingThings(BreatheImplementor breatheImplementor){
        this.breatheImplementor = breatheImplementor;
    }

    public abstract void breatheProcess();
}
