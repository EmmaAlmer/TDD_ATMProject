import java.time.LocalDateTime;

public class TransactionHistory {
    private String fromName, toName;
    private int amount;
    private LocalDateTime timeStamp;

    public TransactionHistory(String fromName, String toName, int amount, LocalDateTime timeStamp) {
        this.fromName = fromName;
        this.toName = toName;
        this.amount = amount;
        this.timeStamp = timeStamp;
    }

    public String toString(){
        return
                timeStamp + ": " +
                "From: " + fromName +
                ", To: " + toName +
                ", Amount: " + amount;
    }
}
