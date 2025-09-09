package com.java.patterns.patterns.observerpattern.observable;

import com.java.patterns.patterns.observerpattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservableImpl implements StockObservable{

    List<NotificationAlertObserver> observerList = new ArrayList<>();
    Integer stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {

        for(NotificationAlertObserver observer : observerList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {

        if(stockCount == 0){
            notifySubscribers();
        }
        stockCount = newStockCount;
    }

    @Override
    public Integer getStockCount() {
        return stockCount;
    }
}
