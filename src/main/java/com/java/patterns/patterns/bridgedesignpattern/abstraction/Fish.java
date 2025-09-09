package com.java.patterns.patterns.bridgedesignpattern.abstraction;

import com.java.patterns.patterns.bridgedesignpattern.implementor.BreatheImplementor;

public class Fish extends LivingThings{

    public Fish(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        breatheImplementor.breathe();
    }
}
