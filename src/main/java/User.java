public class User {

    MoneyStorage cash;

    public User(int cash) {
        this.cash = new MoneyStorage(cash);
    }
    public User() {
        this.cash = new MoneyStorage();
    }

    public MoneyStorage getMoneyStorage() {
        return cash;
    }
}
