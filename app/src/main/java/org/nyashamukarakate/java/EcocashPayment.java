package org.nyashamukarakate.java;

public class EcocashPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Ecocash transaction of $" + amount);
    }
}
