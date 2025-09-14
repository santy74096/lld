package com.java.patterns.lld.elevatorsystem.model.button;

import com.java.patterns.lld.elevatorsystem.dispatcher.ExternalDispatcher;
import com.java.patterns.lld.elevatorsystem.model.Direction;
import lombok.Getter;

public class ExternalButton extends Button{

    private final ExternalDispatcher externalDispatcher = ExternalDispatcher.INSTANCE;

    @Getter
    private Direction direction;

    @Override
    public void pressButton(int floor, Direction direction){
        this.direction = direction;
        System.out.println("Pressed %s from floor %s".formatted(direction, floor));
        externalDispatcher.submitRequest(floor, direction);
    }
}
