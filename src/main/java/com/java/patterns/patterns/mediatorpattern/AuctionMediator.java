package com.java.patterns.patterns.mediatorpattern;

public interface AuctionMediator {

    void addBidder(IBidder bidder);

    void placeBid(IBidder bidder, int bid);
}
