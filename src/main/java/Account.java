import java.util.ArrayList;

public class Account {

    int id;
    MoneyStorage balance;
    ArrayList<TransactionHistory> history = new ArrayList<>();

    public Account(int id, int balance) {
        this.id = id;
        this.balance = new MoneyStorage(balance);
    }

    public Account(int id) {
        this.id = id;
        this.balance = new MoneyStorage();
    }


    public int getId() {
        return id;
    }

    public MoneyStorage getMoneyStorage() {
        return balance;
    }

    public void addTransactionToHistory(TransactionHistory history) {
        this.history.add(history);
    }
    public ArrayList<TransactionHistory> getTransactionHistory() {
        return history;
    }
}
