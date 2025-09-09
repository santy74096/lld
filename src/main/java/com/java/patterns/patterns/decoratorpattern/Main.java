package com.java.patterns.patterns.decoratorpattern;

import com.java.patterns.patterns.decoratorpattern.decorator.ExtraCheese;
import com.java.patterns.patterns.decoratorpattern.decorator.ExtraVeggie;

public class Main {

    public static void main(String[] args) {

        BasePizza pizza = new Paneer();

        BasePizza pizzaWithExtraCheese = new ExtraCheese(new Paneer());

        BasePizza pizzaWithExtraCheeseAndExtraVeggie = new ExtraVeggie(new ExtraCheese(new Paneer()));

        System.out.println(pizza.cost());
    }
}
