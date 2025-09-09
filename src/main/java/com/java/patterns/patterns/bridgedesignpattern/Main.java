package com.java.patterns.patterns.bridgedesignpattern;

import com.java.patterns.patterns.bridgedesignpattern.abstraction.Fish;
import com.java.patterns.patterns.bridgedesignpattern.abstraction.Human;
import com.java.patterns.patterns.bridgedesignpattern.abstraction.LivingThings;
import com.java.patterns.patterns.bridgedesignpattern.implementor.LandBreathe;
import com.java.patterns.patterns.bridgedesignpattern.implementor.WaterBreathe;

public class Main {

    public static void main(String[] args) {

        LivingThings human = new Human(new LandBreathe());
        human.breatheProcess();

        LivingThings fish = new Fish(new WaterBreathe());
        fish.breatheProcess();
    }
}
