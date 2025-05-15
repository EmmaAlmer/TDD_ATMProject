package se.tddproject.moneystorage;

import java.util.ArrayList;

public class MoneyStorageWithReciept extends MoneyStorage {

    ArrayList<TransactionHistory> history = new ArrayList<>();

    public MoneyStorageWithReciept(int balance) {
        super(balance);
    }

    public ArrayList<TransactionHistory> getTransactionHistory() {
        return history;
    }

    @Override
    public void deposit(int amount, String from) {
        createReceipt(from, "me", amount);
        super.deposit(amount, from);
    }

    @Override
    public boolean withdraw(int amount, String to) {
        createReceipt("me", to, amount);
        return super.withdraw(amount, to);
    }

    void createReceipt(String from, String to, int amount){
        //gör kvitto
        history.add(new TransactionHistory(from, to, amount));
    }

    public TransactionHistory getLastTransaction() {
        return history.getLast();
    }
}
