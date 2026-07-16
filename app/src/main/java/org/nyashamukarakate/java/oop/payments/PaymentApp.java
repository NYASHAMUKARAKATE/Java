package org.nyashamukarakate.java.oop.payments;

public class PaymentApp {
    public static void run() {
        System.out.println("\n--- Payment Gateway Demo (Interfaces) ---");
        PaymentMethod[] methods = { new VisaPayment(), new EcocashPayment(), new PayPalPayment() };
        double amount = 49.99;
        for (PaymentMethod method : methods) {
            method.processPayment(amount);
        }
    }
}
