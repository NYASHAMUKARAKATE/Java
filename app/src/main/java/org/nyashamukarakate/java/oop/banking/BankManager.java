package org.nyashamukarakate.java.oop.banking;

public class BankManager {
    public static void run() {
        System.out.println("\n--- Bank Account Demo (Encapsulation) ---");
        BankAccount account = new BankAccount("ACC-001", "Nyasha", 1000.0);
        System.out.println("  Holder : " + account.getAccountHolderName());
        System.out.printf("  Opening balance: $%.2f%n", account.getBalance());
        account.deposit(500.0);
        account.withdraw(200.0);
        System.out.printf("  Final balance  : $%.2f%n", account.getBalance());
    }
}
