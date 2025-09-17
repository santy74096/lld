package com.java.patterns.lld.elevatorsystem.algorithm;

import com.java.patterns.lld.elevatorsystem.model.Direction;
import com.java.patterns.lld.elevatorsystem.model.ElevatorController;

import java.util.concurrent.ThreadLocalRandom;

public class OddEven extends ElevatorSelectionStrategy{

    public int selectElevator(int floor, Direction direction){
        for(ElevatorController eController: elevatorControllerList)
        {
            //old elevator for odd floors and even elevators for even floors
            //select elevator which is moving in same direction which is requested or IDLE elevator
//            if(floor%2 == eController.getId()%2)
//            {
//                int currFloor= eController.getElevatorCar().getCurrentFloor();
//                Direction currDir= eController.getElevatorCar().getDir();
//                if(floor>currFloor && currDir==Direction.UP)
//                    return eController.getId();
//                else if(floor<currFloor && currDir==Direction.DOWN)
//                    return eController.getId();
//                else if(currDir==Direction.NONE)
//                    return eController.getId();
//
//            }
        }
        return ThreadLocalRandom.current().nextInt(1, elevatorControllerList.size());
    }
}
