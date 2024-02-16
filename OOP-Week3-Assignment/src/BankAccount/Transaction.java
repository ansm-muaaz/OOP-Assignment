package BankAccount;

import java.util.*;
public class Transaction {

    private char type;
    private double amount;
    private double balance;
    private Date date;
    private String Description;

    public Transaction(char type, double amount, double balance, String Description){
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.Description = Description;
        date = new Date();

    }
    @Override
    public String toString() {
        return "Type: " + type + ", Amount: " + amount + ", Balance after transaction: " + balance + ", Date: " + date + ", Description: " + Description;
    }

}
