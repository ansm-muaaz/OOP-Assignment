package BankAccount;

import java.util.*;


public class Client {
    private int clientID;
    private String name;
    private String phone;
    private ArrayList<Account> accounts;

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public Client(int clientID, String name, String phone){
        this.clientID = clientID;
        this.name = name;
        this.phone = phone;
        this.accounts = new ArrayList<Account>();
    }
    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

//    public boolean addAccount(Account account){
//        accounts.add(account);
//        return true;
//    }
//    public boolean removeAccount(int accountID) {
//        java.util.Iterator<Account> iterator = accounts.iterator();
//        while (iterator.hasNext()) {
//            Account account = iterator.next();
//            if (account.getId() == accountID) {
//                iterator.remove();
//                return true;
//            }
//        }
//        return false;
//    }
    public String toString(){
        String S = this.clientID +" "+this.phone+" "+this.name+"/n";
        for (Account account : accounts){
            S += account.toString()+"/n";
        }
        return S;
    }

}