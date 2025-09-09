package com.java.patterns.patterns.observerpattern.observer;

public class SmsAlertObserver implements NotificationAlertObserver{

    String userId;

    public SmsAlertObserver(String userId){
        this.userId = userId;
    }

    @Override
    public void update() {
        sendMail(userId, "hurry up stock is available now");
    }

    private void sendMail(String userId, String msg) {

        System.out.println("SMS sent to: " + userId);
    }
}
