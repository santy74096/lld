package com.java.patterns.patterns.visitorpattern.visitor;

import com.java.patterns.patterns.visitorpattern.element.DoubleRoom;
import com.java.patterns.patterns.visitorpattern.element.SingleRoom;

public class RoomMaintainanceVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoom roomElement) {
        System.out.println("maintaining single room");
    }

    @Override
    public void visit(DoubleRoom roomElement) {
        System.out.println("maintaining double room");
    }
}
