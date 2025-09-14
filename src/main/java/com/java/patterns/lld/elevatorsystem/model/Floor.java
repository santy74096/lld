package com.java.patterns.lld.elevatorsystem.model;

import com.java.patterns.lld.elevatorsystem.dispatcher.ExternalDispatcher;
import com.java.patterns.lld.elevatorsystem.model.button.Button;
import com.java.patterns.lld.elevatorsystem.model.button.ExternalButton;

public class Floor {

    private int id;
    private Display display;
    private Button button;

    public Floor(int id){
        this.id = id;
        this.display = new Display();
        this.button = new ExternalButton();
    }

    public void pressButton(Direction direction){
        button.pressButton(id, direction);
    }

    private void setDisplay(int floor, Direction direction){
        display.setFloor(floor);
        display.setDirection(direction);
    }
}
