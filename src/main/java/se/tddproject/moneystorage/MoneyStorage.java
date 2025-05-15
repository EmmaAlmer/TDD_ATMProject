package se.tddproject.moneystorage;

public class MoneyStorage {

    int balance = 0;

    public MoneyStorage(int balance) {
        this.balance = balance;
    }

    public int getBalance(){
        return balance;
    }

    //hjälpmetod till transferTo. kan hjälpa framtida ändringar
    public void deposit(int amount, String from) {
        balance += amount;
    }
    //hjälpmetod till transferTo. kan hjälpa framtida ändringar
    public boolean withdraw(int amount, String to){
        if(amount <= this.balance){
            balance -= amount;
            return true;
        }
        return false;
    }

    //överför från den här MoneyStoragen till 'to'
    //ex från account till cash eller tvärtom
    public boolean transferTo(MoneyStorage toStorage, int amount, String from, String to) {
        if(withdraw(amount, to)){
            toStorage.deposit(amount, from);
            return true;
        }
        return false;
    }
}
