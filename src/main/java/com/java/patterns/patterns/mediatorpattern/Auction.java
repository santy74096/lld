package com.java.patterns.patterns.mediatorpattern;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator{

    List<IBidder> bidders = new ArrayList<>();

    @Override
    public void addBidder(IBidder bidder) {
        bidders.add(bidder);
    }

    @Override
    public void placeBid(IBidder bidder, int bid) {
        for(IBidder iBidder : bidders){
            if(bidder.getName() != iBidder.getName()){
                iBidder.receiveNotification(bid);
            }
        }
    }
}
