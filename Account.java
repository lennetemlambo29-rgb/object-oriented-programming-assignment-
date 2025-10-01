package bankingapp;


public class Account extends Bank {

    public Account(String accountName, double balance) {
        super(accountName, balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
            recordTransaction(accountName + " deposited " + amount + ". Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
            recordTransaction(accountName + " attempted invalid deposit: " + amount);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
            recordTransaction(accountName + " withdrew " + amount + ". Balance: " + balance);
        } else {
            System.out.println("Withdrawal amount exceeded account balance.");
            recordTransaction(accountName + " attempted withdrawal of " + amount + " (FAILED). Balance: " + balance);
        }
    }

    @Override
    public double getBalance() {
        recordTransaction(accountName + " checked balance. Current balance: " + balance);
        return balance;
    }
}
