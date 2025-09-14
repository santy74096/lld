package com.java.patterns.lld.elevatorsystem.model;

import com.java.patterns.lld.elevatorsystem.dispatcher.InternalDispatcher;
import com.java.patterns.lld.elevatorsystem.model.button.Button;
import com.java.patterns.lld.elevatorsystem.model.button.InternalButton;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
public class ElevatorCar {

    private int id;
    private Button button;
    private Display display;
    private Door door;

    @Setter
    private int currentFloor;   //updated while elevator moves to each floor
    private Direction direction;    //updated everytime elevator changes direction

    public ElevatorCar(int id){
        this.id = id;
        this.button = new InternalButton(new InternalDispatcher());
        this.display = new Display();
        this.door = new Door();
        this.currentFloor = 0;
        this.direction = Direction.NONE;
    }

    public void move(Direction direction, int floor){
        System.out.println("Elevator " + id + " moving " + direction);
        System.out.println("Elevator " + id + " stops at floor " + floor);
        door.open(id);
        door.close(id);
        setDisplay();
    }

    public void pressButton(int floor){
        Direction dir = Direction.NONE;
        if(floor > currentFloor){
            direction = Direction.UP;
        } else if(floor < currentFloor){
            direction = Direction.DOWN;
        }
        button.pressButton(floor, direction, id);
    }

    private void setDisplay(){
        display.setFloor(currentFloor);
        display.setDirection(direction);
    }
}
