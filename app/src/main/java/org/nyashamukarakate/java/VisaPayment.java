package org.nyashamukarakate.java;

public class VisaPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Visa card transaction of $" + amount);
    }
}
