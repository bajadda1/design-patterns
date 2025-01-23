package com.ahmed.bajadda;

import com.ahmed.bajadda.context.PaymentContext;
import com.ahmed.bajadda.strategy.impl.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        // Pay with Credit Card
        paymentContext.setPaymentStrategy(new CreditCardPayment("1234567812345678"));
        paymentContext.processPayment(100.0);

        // Pay with PayPal
        paymentContext.setPaymentStrategy(new PayPalPayment("user@example.com"));
        paymentContext.processPayment(200.0);

        // Pay with Cryptocurrency
        paymentContext.setPaymentStrategy(new CryptoPayment("1A2b3C4D5e6F"));
        paymentContext.processPayment(300.0);
    }
}
