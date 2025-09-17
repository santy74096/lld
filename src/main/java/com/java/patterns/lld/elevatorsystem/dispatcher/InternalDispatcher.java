package com.java.patterns.lld.elevatorsystem.dispatcher;

import com.java.patterns.lld.elevatorsystem.model.Direction;
import com.java.patterns.lld.elevatorsystem.model.ElevatorController;
import com.java.patterns.lld.elevatorsystem.model.ElevatorSystem;

public class InternalDispatcher {

//    public static InternalDispatcher INSTANCE = new InternalDispatcher();

    public void submitRequest(int floor, Direction direction, int elevatorId){
        for(ElevatorController eController: ElevatorSystem.INSTANCE.getElevatorControllerList())
        {
            if(eController.getId()== elevatorId)
            {
                eController.acceptRequest(floor, direction);
            }
        }
    }
}
