public class User {

    int cash;

    public User(int cash) {
        this.cash = cash;
    }

    public int getCash() {
        return cash;
    }

    public boolean removeCash(int cash){

        if (cash <= this.cash){
            this.cash -= cash;
            return true;
        }
        return false;
    }

    public void addCash(int cash) {
        this.cash += cash;
    }
}
