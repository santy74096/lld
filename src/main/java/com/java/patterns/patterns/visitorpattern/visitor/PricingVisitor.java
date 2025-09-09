package com.java.patterns.patterns.visitorpattern.visitor;

import com.java.patterns.patterns.visitorpattern.element.DoubleRoom;
import com.java.patterns.patterns.visitorpattern.element.RoomElement;
import com.java.patterns.patterns.visitorpattern.element.SingleRoom;

public class PricingVisitor implements RoomVisitor{


    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Pricing calculation of single room");
        singleRoom.price = 1000;
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Pricing calculation of double room");
        doubleRoom.price = 1000;
    }
}
