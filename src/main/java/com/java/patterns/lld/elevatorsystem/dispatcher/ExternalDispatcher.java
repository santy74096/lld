package com.java.patterns.lld.elevatorsystem.dispatcher;

import com.java.patterns.lld.elevatorsystem.model.Direction;
import com.java.patterns.lld.elevatorsystem.model.ElevatorController;
import com.java.patterns.lld.elevatorsystem.model.ElevatorSystem;

public class ExternalDispatcher {

    public static ExternalDispatcher INSTANCE = new ExternalDispatcher();

    public void submitRequest(int floor, Direction direction){
        int elevatorId= ElevatorSystem.elevatorSelectionStrategy.selectElevator(floor, direction);
        System.out.println("Selected elevator " + elevatorId);
        for(ElevatorController eController: ElevatorSystem.INSTANCE.getElevatorControllerList())
        {
            if(eController.getId()== elevatorId)
            {
                eController.acceptRequest(floor, direction);
            }
        }
    }
}
