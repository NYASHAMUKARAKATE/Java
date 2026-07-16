package org.nyashamukarakate.java.oop.banking;

import java.util.Scanner;

public class AtmSimulator {
    public static void run(Scanner scanner) {
        System.out.println("\n--- ATM Simulator (Control Flow) ---");
        double balance = 1000.00;
        System.out.println("  1. Check Balance  2. Deposit  3. Withdraw  4. Exit");
        System.out.print("  Choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.printf("  Balance: $%.2f%n", balance);
                break;
            case 2:
                System.out.print("  Deposit amount: $");
                double deposit = scanner.nextDouble();
                if (deposit > 0) { balance += deposit; System.out.println("  Deposit successful."); }
                else System.out.println("  Invalid amount.");
                break;
            case 3:
                System.out.print("  Withdraw amount: $");
                double withdraw = scanner.nextDouble();
                if (withdraw > 0 && withdraw <= balance) { balance -= withdraw; System.out.println("  Withdrawal successful."); }
                else System.out.println("  Insufficient funds.");
                break;
            case 4:
                System.out.println("  Goodbye!");
                break;
            default:
                System.out.println("  Invalid choice.");
        }
        System.out.printf("  Final balance: $%.2f%n", balance);
    }
}
