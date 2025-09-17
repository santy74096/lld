package com.java.patterns.lld.elevatorsystem.model;

import com.java.patterns.lld.elevatorsystem.algorithm.PendingRequests;
import lombok.Getter;

@Getter
public class ElevatorController {

    int id;
    private ElevatorCar elevatorCar;

    public ElevatorController(int id){
        this.id = id;
        elevatorCar = new ElevatorCar(id);
    }


    public void acceptRequest(int floor, Direction direction){
        ElevatorSystem.elevatorControlStrategy.getPendingRequests().add(new PendingRequests(floor, direction));
        controlCar();
    }

    public void controlCar(){
        ElevatorSystem.elevatorControlStrategy.moveElevator(this);
        System.out.println("Elevator moving...");
    }

}
