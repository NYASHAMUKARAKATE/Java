package org.nyashamukarakate.java.oop.payments;

public class EcocashPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.printf("  Processing Ecocash transaction of $%.2f%n", amount);
    }
}
