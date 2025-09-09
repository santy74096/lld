package com.java.patterns.patterns.templatepattern;

public class PayToMerchantPaymentFlow extends PaymentFlow{

    @Override
    public void validateRequest() {
        System.out.println("validating request for merchant's transaction");
    }

    @Override
    public void calculateFee() {
        System.out.println("transaction fee is 1%");
    }

    @Override
    public void debitAmount() {
        System.out.println("debiting amount from payee");
    }

    @Override
    public void creditAmount() {
        System.out.println("crediting remaining amount to merchant's account");
    }
}
