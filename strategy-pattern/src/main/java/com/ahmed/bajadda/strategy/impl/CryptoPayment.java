package com.ahmed.bajadda.strategy.impl;

import com.ahmed.bajadda.strategy.PaymentStrategy;

// Concrete strategy for cryptocurrency payments
public class CryptoPayment implements PaymentStrategy {
    private final String walletAddress;

    public CryptoPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Cryptocurrency wallet: " + walletAddress);
    }
}
