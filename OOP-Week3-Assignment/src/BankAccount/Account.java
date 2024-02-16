package BankAccount;

import java.util.Date;
import java.util.ArrayList;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transaction> transactions;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();
        this.transactions = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public boolean withdraw(double amount) {
        if (this.balance < amount)
            return false;
        this.balance -= amount;
        transactions.add(new Transaction('W', amount, this.balance, "Withdrawal"));
        return true;
    }

    public void deposit(double amount) {
        this.balance += amount;
        transactions.add(new Transaction('D', amount, this.balance, "Deposit"));
    }

    public String toString() {
        return "Account ID: " + id + "\nBalance: $" + balance + "\nAnnual Interest Rate: " + annualInterestRate
                + "\nDate Created: " + dateCreated + "\n";
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
}
