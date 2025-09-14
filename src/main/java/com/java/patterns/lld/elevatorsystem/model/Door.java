package com.java.patterns.lld.elevatorsystem.model;

public class Door {

    public void open(int elevatorId){
        System.out.println("door opens for " + elevatorId);
    }

    public void close(int elevatorId){
        System.out.println("door closes for " + elevatorId);
    }
}
