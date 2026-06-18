package org.nyashamukarakate.java;
import java.util.Scanner;

public class AtmSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 1000.00;
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");

        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("Your current balance is: $" + balance);
                break;
            case 2: 
                System.out.print("Enter amount to deposit: $");
                double depositAmount = scanner.nextDouble();

                if (depositAmount <= 0) {
                    System.out.println("Invalid deposit amount. Please enter a positive value.");
                    break;
                }
                balance += depositAmount;
                System.out.println("Amount deposited successfully.");
                break;
            case 3:
                System.out.print("Enter amount to withdraw: $");
                double withdrawAmount = scanner.nextDouble();
                if (withdrawAmount <= balance) {
                    balance -= withdrawAmount;
                    System.out.println("Amount withdrawn successfully.");
                } else {
                    System.out.println("Insufficient funds.");
                }
                break;
            case 4:
                System.out.println("Thank you for using the ATM.");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
        System.out.println("Transaction Details: ");
        System.out.println("Initial Balance: $" + 1000.00);
        System.out.println("Final Balance: $" + balance);
        scanner.close();
    }
}
