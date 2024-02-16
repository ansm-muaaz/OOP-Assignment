package BankAccount;

import java.util.*;
public class Client {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private ArrayList<Account> accounts;


    public Client(int id, String name, String phone){
        this.id = id;
        this.name = name;
        this.phone = phone;

        accounts = new ArrayList<Account>();
    }
    public boolean addAccount(Account account){
        accounts.add(account);
        return true;
    }
    public boolean removeAccount(int accountID) {
        java.util.Iterator<Account> iterator = accounts.iterator();
        while (iterator.hasNext()) {
            Account account = iterator.next();
            if (account.getId() == accountID) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
    public String toString(){
        String S = this.id+" "+this.phone+" "+this.name+"/n";
        for (Account account : accounts){
            S += account.toString()+"/n";
        }
        return S;
    }

}