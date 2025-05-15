package se.tddproject.base;

import se.tddproject.moneystorage.MoneyStorage;
import se.tddproject.moneystorage.MoneyStorageWithReciept;
import se.tddproject.moneystorage.TransactionHistory;

import java.util.ArrayList;

public class Account {

    int id;
    private MoneyStorageWithReciept balance;

    public Account(int id, int balance) {
        this.id = id;
        this.balance = new MoneyStorageWithReciept(balance);
    }

    public Account(int id) {
        this.id = id;
        this.balance = new MoneyStorageWithReciept(0);
    }


    public int getId() {
        return id;
    }

    public MoneyStorageWithReciept getMoneyStorage() {
        return balance;
    }

    public int getBalance(){
        return this.balance.getBalance();
    }
}
