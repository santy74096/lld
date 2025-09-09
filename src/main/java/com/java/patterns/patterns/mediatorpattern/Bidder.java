package com.java.patterns.patterns.mediatorpattern;

public class Bidder implements IBidder{

    AuctionMediator auctionMediator;
    String name;

    public Bidder(String name, AuctionMediator auctionMediator){
        this.name = name;
        this.auctionMediator = auctionMediator;
        auctionMediator.addBidder(this);
    }

    @Override
    public void placeBid(int bid) {
        auctionMediator.placeBid(this, bid);
    }

    @Override
    public void receiveNotification(int bid) {
        System.out.println("Current bid is " + bid + " received by " + this.name);
    }

    @Override
    public String getName() {
        return name;
    }
}
