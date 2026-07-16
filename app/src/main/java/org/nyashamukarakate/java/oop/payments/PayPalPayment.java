package org.nyashamukarakate.java.oop.payments;

public class PayPalPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.printf("  Processing PayPal transaction of $%.2f%n", amount);
    }
}
