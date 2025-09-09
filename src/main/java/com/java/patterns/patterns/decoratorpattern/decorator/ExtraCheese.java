package com.java.patterns.patterns.decoratorpattern.decorator;

import com.java.patterns.patterns.decoratorpattern.BasePizza;

public class ExtraCheese extends ToppingsDecorator{

    BasePizza pizza;

    public ExtraCheese(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public Integer cost() {
        return pizza.cost() + 10;
    }
}
