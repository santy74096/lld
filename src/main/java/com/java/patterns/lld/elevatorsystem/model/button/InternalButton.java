package com.java.patterns.lld.elevatorsystem.model.button;

import com.java.patterns.lld.elevatorsystem.dispatcher.InternalDispatcher;
import com.java.patterns.lld.elevatorsystem.model.Direction;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class InternalButton extends Button{

    private final InternalDispatcher internalDispatcher;

    @Getter
    private List<Integer> floors = new ArrayList<>();

    public InternalButton(InternalDispatcher internalDispatcher){
        this.internalDispatcher = internalDispatcher;
    }

    @Override
    public void pressButton(int floor, Direction direction, int elevatorId){
        floors.add(floor);
        System.out.println("Pressed floor %s from elevator %s".formatted(floor, elevatorId));
        internalDispatcher.submitRequest(floor, direction, elevatorId);
    }
}
