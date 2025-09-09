package com.java.patterns.patterns.visitorpattern;

import com.java.patterns.patterns.visitorpattern.element.DoubleRoom;
import com.java.patterns.patterns.visitorpattern.element.RoomElement;
import com.java.patterns.patterns.visitorpattern.element.SingleRoom;
import com.java.patterns.patterns.visitorpattern.visitor.PricingVisitor;
import com.java.patterns.patterns.visitorpattern.visitor.RoomMaintainanceVisitor;
import com.java.patterns.patterns.visitorpattern.visitor.RoomVisitor;

public class Client {

    public static void main(String[] args) {

        RoomElement singleRoom = new SingleRoom();
        RoomVisitor pricingRoomVisitor = new PricingVisitor();
        singleRoom.accept(pricingRoomVisitor);

        RoomElement doubleRoom = new DoubleRoom();
        RoomVisitor maintainanceRoomVisitor = new RoomMaintainanceVisitor();
        doubleRoom.accept(maintainanceRoomVisitor);
    }
}
