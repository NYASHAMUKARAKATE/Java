package org.nyashamukarakate.java;

public class BankManager {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456", "Nyasha", 1000.0);
        System.out.println("Account Number: " + account1.getAccountNumber());
        System.out.println("Account Holder: " + account1.getAccountHolderName());
        System.out.println("Initial Balance: " + account1.getBalance());
        account1.deposit(500.0);
        account1.withdraw(200.0);
        System.out.println("Updated Balance: " + account1.getBalance());
        
    }
}
