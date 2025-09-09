package com.java.patterns.patterns.visitorpattern.visitor;

import com.java.patterns.patterns.visitorpattern.element.DoubleRoom;
import com.java.patterns.patterns.visitorpattern.element.RoomElement;
import com.java.patterns.patterns.visitorpattern.element.SingleRoom;

public interface RoomVisitor {

    void visit(SingleRoom roomElement);

    void visit(DoubleRoom roomElement);
}
