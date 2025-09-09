package com.java.patterns.patterns.templatepattern;

public class Client {

    public static void main(String[] args) {
        PaymentFlow paymentFlow = new PayToMerchantPaymentFlow();

        paymentFlow.sendMoney();
    }
}
