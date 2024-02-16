package BankAccount;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Account> accounts = new ArrayList<>();

        Account account1 = new Account(101, 1000, 0.05);
        Account account2 = new Account(102, 2000, 0.03);
        accounts.add(account1);
        accounts.add(account2);

        performTransactions(account1);
        performTransactions(account2);

        printTransactions(accounts);
    }
    public static void performTransactions(Account account) {
        account.deposit(500);
        account.withdraw(200);
        account.deposit(1000);
    }
    public static void printTransactions(ArrayList<Account> accounts) {
        for (Account account : accounts) {
            System.out.println("Account ID: " + account.getId());
            System.out.println("Number of transactions: " + account.getTransactions().size());
            System.out.println("Transactions:");
            for (Transaction transaction : account.getTransactions()) {
                System.out.println(transaction);
            }
            System.out.println();
        }
    }
}

