package com.ahmed.bajadda.strategy.impl;

import com.ahmed.bajadda.strategy.PaymentStrategy;

// Concrete strategy for credit card payments
public class CreditCardPayment implements PaymentStrategy {
    private final String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card ending with " + cardNumber.substring(cardNumber.length() - 4));
    }
}
