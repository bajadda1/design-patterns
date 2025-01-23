package com.ahmed.bajadda.context;

import com.ahmed.bajadda.strategy.PaymentStrategy;

// Context class
public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    // Method to set the strategy dynamically
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Method to process payment using the chosen strategy
    public void processPayment(double amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Payment strategy not set");
        }
        paymentStrategy.pay(amount);
    }
}
