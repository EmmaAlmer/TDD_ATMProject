//är en "instans" av pengar, antingen på konto eller fysiskt
public class MoneyStorage {
    int balance;

    public MoneyStorage(int startBalance) {
        balance = startBalance;
    }

    public MoneyStorage(){
        balance = 0;
    }

    public int getBalance()
    {
        return balance;
    }

    public void setBalance(int newBalance)
    {
        balance = newBalance;
    }

    public void deposit(int toDeposit)
    {
        balance += toDeposit;
    }

    public boolean withdraw(int toWithdraw){
        if (toWithdraw <= this.balance){
            this.balance -= toWithdraw;
            return true;
        }
        return false;
    }

    public boolean transferTo(MoneyStorage to, int amount){
        if(withdraw(amount)){
            to.deposit(amount);
            return true;
        }
        return false;
    }
}
