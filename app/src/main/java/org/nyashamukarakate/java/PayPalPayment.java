package org.nyashamukarakate.java;

public class PayPalPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal transaction of $" + amount);
    }
}
