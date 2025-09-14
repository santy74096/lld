package com.java.patterns.lld.elevatorsystem.model.button;

import com.java.patterns.lld.elevatorsystem.model.Direction;

public class Button {

    //for external button
    public void pressButton(int floor, Direction direction){}

    //for internal button
    public void pressButton(int floor, Direction direction, int elevatorId){}
}
