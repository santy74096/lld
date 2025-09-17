package com.java.patterns.lld.elevatorsystem.algorithm;

import com.java.patterns.lld.elevatorsystem.model.Direction;
import lombok.Getter;

@Getter
public class PendingRequests {

    private int floor;
    private Direction direction;

    public PendingRequests(int floor, Direction direction){
        this.floor = floor;
        this.direction = direction;
    }
}
