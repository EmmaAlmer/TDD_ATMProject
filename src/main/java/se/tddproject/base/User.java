package se.tddproject.base;

import se.tddproject.moneystorage.MoneyStorage;

public class User {

    MoneyStorage cash;

    public User(int cash) {
        this.cash = new MoneyStorage(cash);
    }
    public User() {
        this.cash = new MoneyStorage(0);
    }

    public MoneyStorage getMoneyStorage() {
        return cash;
    }
}
