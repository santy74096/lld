package com.java.patterns.lld.elevatorsystem.model;

import com.java.patterns.lld.elevatorsystem.algorithm.ElevatorControlStrategy;
import com.java.patterns.lld.elevatorsystem.algorithm.ElevatorSelectionStrategy;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ElevatorSystem {

    private List<ElevatorController> elevatorControllerList = new ArrayList<>();
    public List<Floor> floors = new ArrayList<>();

    public static ElevatorControlStrategy elevatorControlStrategy;
    public static ElevatorSelectionStrategy elevatorSelectionStrategy;

    public static ElevatorSystem INSTANCE = new ElevatorSystem();

    private ElevatorSystem(){

    }

    public void addElevator(ElevatorController elevatorController){
        elevatorControllerList.add(elevatorController);
    }

    public void removeElevator(ElevatorController elevatorController){
        elevatorControllerList.remove(elevatorController);
    }

    public void addFloor(Floor floor){
        floors.add(floor);
    }

    public void setElevatorControlStrategy(ElevatorControlStrategy elevatorControlStrategy)
    {
        this.elevatorControlStrategy= elevatorControlStrategy;
    }
    public void setElevatorSelectionStrategy(ElevatorSelectionStrategy elevatorSelectionStrategy)
    {
        this.elevatorSelectionStrategy= elevatorSelectionStrategy;
    }
}
