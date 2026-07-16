package org.nyashamukarakate.java.oop.banking;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
    public String getAccountHolderName() { return accountHolderName; }
    public void setAccountHolderName(String name) { this.accountHolderName = name; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("  Deposited $%.2f. New balance: $%.2f%n", amount, balance);
        } else {
            System.out.println("  Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("  Withdrew $%.2f. New balance: $%.2f%n", amount, balance);
        } else {
            System.out.println("  Invalid withdrawal amount.");
        }
    }
}
