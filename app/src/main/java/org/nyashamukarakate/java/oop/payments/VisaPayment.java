package org.nyashamukarakate.java.oop.payments;

public class VisaPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.printf("  Processing Visa card transaction of $%.2f%n", amount);
    }
}
