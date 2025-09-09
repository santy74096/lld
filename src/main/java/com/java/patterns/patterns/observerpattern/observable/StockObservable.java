package com.java.patterns.patterns.observerpattern.observable;

import com.java.patterns.patterns.observerpattern.observer.NotificationAlertObserver;

public interface StockObservable {

    void add(NotificationAlertObserver observer);

    void remove(NotificationAlertObserver observer);

    void notifySubscribers();

    void setStockCount(int newStockCount);

    Integer getStockCount();
}
