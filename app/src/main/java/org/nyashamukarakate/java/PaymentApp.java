package org.nyashamukarakate.java;
import java.util.Scanner;

public class PaymentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a payment method:");
        System.out.println("1. Visa");
        System.out.println("2. Ecocash");
        System.out.println("3. PayPal");
        int choice = scanner.nextInt();

        PaymentMethod paymentMethod;

        switch (choice) {
            case 1:
                paymentMethod = new VisaPayment();
                break;
            case 2:
                paymentMethod = new EcocashPayment();
                break;
            case 3:
                paymentMethod = new PayPalPayment();
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.print("Enter the amount to pay: ");
        double amount = scanner.nextDouble();
        paymentMethod.processPayment(amount);
    }
}
