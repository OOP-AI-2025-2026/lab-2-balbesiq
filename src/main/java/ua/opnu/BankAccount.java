package ua.opnu;

public class BankAccount {
    String name;
    double balance;
    double transactionFee = 0;

    void deposit(double amount) {
        if(amount>0)
        balance = balance + amount;
    }

    double getBalance() {
        return this.balance;
    }

    boolean withdraw(double amount) {
        if (amount <= 0) {
            return false;
        }
        if (balance >= amount + transactionFee) {
            balance -= amount + transactionFee;
            return true;
        }
        return false;
    }

    boolean transfer(BankAccount receiver, double amount) {
        if (amount <= 0) {
            return false;
        }
        if (balance >= amount + transactionFee) {
            balance -= amount + transactionFee;
            receiver.balance += amount;
            return true;
        }
        return false;
    }
}