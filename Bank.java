package bankingapp;

import java.io.FileWriter;
import java.io.IOException;

public abstract class Bank {
    protected String accountName;
    protected double balance;

    public Bank(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();

    protected void recordTransaction(String message) {
        try (FileWriter writer = new FileWriter("Bank.txt", true)) {
            writer.write(message + System.lineSeparator());
        } catch (IOException e) {
            System.out.println("Error writing to Bank.txt: " + e.getMessage());
        }
    }
}

