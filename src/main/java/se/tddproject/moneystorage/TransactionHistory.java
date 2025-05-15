package se.tddproject.moneystorage;

import java.time.LocalDateTime;

public class TransactionHistory {
    private String fromName, toName;
    private int amount;
    private LocalDateTime timeStamp;

    public TransactionHistory(String fromName, String toName, int amount) {
        this.fromName = fromName;
        this.toName = toName;
        this.amount = amount;
        this.timeStamp = LocalDateTime.now();
    }

    public String getFromName() {
        return fromName;
    }
    public String getToName(){
        return toName;
    }
    public int getAmount(){
        return amount;
    }

    public String toString(){
        return
                timeStamp + ": " +
                "From: " + fromName +
                ", To: " + toName +
                ", Amount: " + amount;
    }
}
