package com.java.patterns.patterns.visitorpattern.element;

import com.java.patterns.patterns.visitorpattern.visitor.RoomVisitor;

public interface RoomElement {

    void accept(RoomVisitor roomVisitor);
}
