package BankAccount;

import java.time.LocalDateTime;
import java.util.*;
public class Transaction {



    private char type;
    private String description;
    private Account sourceAccount;
    private Account destinationAccount;
    private double amount;
    private Date date;

//    private double amount;
//    private double balance;

    public Account getSourceAccount() {
        return sourceAccount;
    }

    public void setSourceAccount(Account sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public Account getDestinationAccount() {
        return destinationAccount;
    }

    public void setDestinationAccount(Account destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

    private Account sourceAccount;
    private Account destinationAccount;

    private Date date;

    public Transaction(char type, double amount, double balance, String Description, Account sourceAccount){
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        this.sourceAccount = sourceAccount;
        date = new Date();


    }

    public double SourceAccount( ){

    }

    @Override
    public String toString() {
        return "Type: " + type
                + ", Amount: " + amount
                + ", Balance after transaction: " + balance
                + ", Date: " + date
                + ", Description: " + Description;
    }

}
