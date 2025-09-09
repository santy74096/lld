package com.java.patterns.patterns.observerpattern;

import com.java.patterns.patterns.observerpattern.observable.IphoneStockObservableImpl;
import com.java.patterns.patterns.observerpattern.observable.StockObservable;
import com.java.patterns.patterns.observerpattern.observer.EmailAlertObserverImpl;
import com.java.patterns.patterns.observerpattern.observer.NotificationAlertObserver;
import com.java.patterns.patterns.observerpattern.observer.SmsAlertObserver;

public class Main {

    public static void main(String[] args) {

        NotificationAlertObserver emailObserver = new EmailAlertObserverImpl("xyx@gmail.com");
        NotificationAlertObserver smsObserver = new SmsAlertObserver("xyz");

        StockObservable iphoneObservable = new IphoneStockObservableImpl();
        iphoneObservable.add(emailObserver);
        iphoneObservable.add(smsObserver);

        iphoneObservable.setStockCount(10);
//        iphoneObservable.setStockCount(100);
//        iphoneObservable.setStockCount(0);
//        iphoneObservable.setStockCount(50);
    }
}
