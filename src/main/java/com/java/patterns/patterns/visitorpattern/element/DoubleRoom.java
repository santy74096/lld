package com.java.patterns.patterns.visitorpattern.element;

import com.java.patterns.patterns.visitorpattern.visitor.RoomVisitor;

public class DoubleRoom implements RoomElement{

    public int price = 0;

    @Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }
}
