package BankAccount;

import java.util.*;

public class Account {

    private int accountNumber;
    private double balance;
    private Client owner;
    private double annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transaction> transactions;

    public Account(int accountNumber, double balance, double annualInterestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();
        this.transactions = new ArrayList<>();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public boolean withdraw(double amount) {
        if (this.balance < amount)
            return false;
        this.balance -= amount;
        transactions.add(new Transaction('W', amount, this.balance, "Withdrawal", accountNumber));
        return true;
    }

    public void deposit(double amount) {
        this.balance += amount;
        transactions.add(new Transaction('D', amount, this.balance, "Deposit"));
    }

    public String toString() {
        return "Account Number: "
                + accountNumber + "\nBalance: $" + balance + "\nAnnual Interest Rate: " + annualInterestRate
                + "\nDate Created: " + dateCreated + "\n";
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
}
