package com.java.patterns.patterns.observerpattern.observer;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;

    public EmailAlertObserverImpl(String emailId){
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendMail(emailId, "hurry up stock is available now");
    }

    private void sendMail(String emailId, String msg) {

        System.out.println("Mail sent to: " + emailId);
    }
}
