package com.java.patterns.lld.elevatorsystem.algorithm;

import com.java.patterns.lld.elevatorsystem.model.Direction;
import com.java.patterns.lld.elevatorsystem.model.ElevatorController;

import java.util.concurrent.ThreadLocalRandom;

import static javax.management.Query.or;

public class Zone extends ElevatorSelectionStrategy{

    public int selectElevator(int floor, Direction direction){
        for(ElevatorController eController: elevatorControllerList)
        {
            //assign elevators according to zones in building
            //out of these elevators select the elevator which is going in the same direction or is idle
        }
        return ThreadLocalRandom.current().nextInt(1, elevatorControllerList.size());
    }
}
