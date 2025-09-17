package com.java.patterns.lld.elevatorsystem.algorithm;

import com.java.patterns.lld.elevatorsystem.model.Direction;
import com.java.patterns.lld.elevatorsystem.model.ElevatorController;
import com.java.patterns.lld.elevatorsystem.model.ElevatorSystem;

import java.util.List;

public class ElevatorSelectionStrategy {

    public List<ElevatorController> elevatorControllerList = ElevatorSystem.INSTANCE.getElevatorControllerList();

    public int selectElevator(int floor, Direction direction){
        return 0;
    }
}
