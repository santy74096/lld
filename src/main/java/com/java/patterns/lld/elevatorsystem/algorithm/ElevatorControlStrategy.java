package com.java.patterns.lld.elevatorsystem.algorithm;

import com.java.patterns.lld.elevatorsystem.model.ElevatorController;
import com.java.patterns.lld.elevatorsystem.model.ElevatorSystem;
import lombok.Getter;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@Getter
public class ElevatorControlStrategy {

    private Queue<PendingRequests> pendingRequests = new LinkedList<>();
    private List<ElevatorController> elevatorControllerList = ElevatorSystem.INSTANCE.getElevatorControllerList();

    public void moveElevator(ElevatorController elevatorController){}
}
