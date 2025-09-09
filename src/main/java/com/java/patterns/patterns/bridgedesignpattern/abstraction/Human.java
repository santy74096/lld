package com.java.patterns.patterns.bridgedesignpattern.abstraction;

import com.java.patterns.patterns.bridgedesignpattern.implementor.BreatheImplementor;

public class Human extends LivingThings{

    public Human(BreatheImplementor breatheImplementor){
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        breatheImplementor.breathe();
    }
}
