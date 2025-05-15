import java.util.ArrayList;

public class Account {

    int id;
    private MoneyStorage balance;
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

    /*public MoneyStorage getMoneyStorage() {
        return balance;
    }*/

    public boolean withdraw(int amount, String to){
        history.add(new TransactionHistory("me", to, amount));
        return this.balance.withdraw(amount);
    }

    public void deposit(int amount, String from){
        history.add(new TransactionHistory(from, "me", amount));
        this.balance.deposit(amount);
    }

    public boolean transferTo(MoneyStorage transferTo, int amount, String to){
        history.add(new TransactionHistory("me", to, amount));
        return this.balance.transferTo(transferTo, amount);
    }

    public boolean transferFrom(MoneyStorage transferFrom, int amount, String from){
        history.add(new TransactionHistory(from, "me", amount));
        return transferFrom.transferTo(this.balance, amount);
    }

    TransactionHistory createReceipt(String from, String to, int amount){
        //gör kvitto och returna det
        TransactionHistory TH = new TransactionHistory(from, to, amount);
        return TH;
    }

    public int getBalance(){
        return this.balance.getBalance();
    }

    public TransactionHistory getLastReciept(){
        return this.history.getLast();
    }

    public void addTransactionToHistory(TransactionHistory history) {
        this.history.add(history);
    }
    public ArrayList<TransactionHistory> getTransactionHistory() {
        return history;
    }
}
