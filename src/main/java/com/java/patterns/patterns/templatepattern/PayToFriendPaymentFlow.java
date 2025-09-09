package com.java.patterns.patterns.templatepattern;

public class PayToFriendPaymentFlow extends PaymentFlow{

    @Override
    public void validateRequest() {
        System.out.println("validating request for friend's transaction");
    }

    @Override
    public void calculateFee() {
        System.out.println("transaction fee is 0%");
    }

    @Override
    public void debitAmount() {
        System.out.println("debiting amount from payee friend");
    }

    @Override
    public void creditAmount() {
        System.out.println("crediting remaining amount to friend's account");
    }
}
