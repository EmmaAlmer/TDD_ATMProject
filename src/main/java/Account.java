public class Account {

    int id;
    int balance;

    public Account(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }


    public int getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public void addCash(int cash){
        this.balance += cash;
    }


    public boolean removeBalance(int cash) {
        if(this.balance >= cash){
            this.balance -= cash;
            return true;
        }
        return false;
    }
}
