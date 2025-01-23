package com.ahmed.bajadda.strategy.impl;

import com.ahmed.bajadda.strategy.PaymentStrategy;

// Concrete strategy for PayPal payments
public class PayPalPayment implements PaymentStrategy {
    private final String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal account: " + email);
    }
}
