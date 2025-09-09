package com.java.patterns.patterns.mediatorpattern;

public interface IBidder {

    void placeBid(int bid);

    void receiveNotification(int bid);

    String getName();
}
