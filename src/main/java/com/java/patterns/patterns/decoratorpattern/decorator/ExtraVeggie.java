package com.java.patterns.patterns.decoratorpattern.decorator;

import com.java.patterns.patterns.decoratorpattern.BasePizza;

public class ExtraVeggie extends ToppingsDecorator{

    BasePizza pizza;

    public ExtraVeggie(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public Integer cost() {
        return pizza.cost() + 20;
    }
}
