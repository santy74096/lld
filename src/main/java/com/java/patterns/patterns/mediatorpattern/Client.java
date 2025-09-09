package com.java.patterns.patterns.mediatorpattern;

public class Client {

    public static void main(String[] args) {

        AuctionMediator auction = new Auction();

        IBidder bidder1 = new Bidder("A", auction);
        IBidder bidder2 = new Bidder("B", auction);
        IBidder bidder3 = new Bidder("C", auction);

        auction.placeBid(bidder2, 200);
    }
}
