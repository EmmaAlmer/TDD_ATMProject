import java.util.ArrayList;

public class Bank {

    ArrayList <Account> accountList = new ArrayList<>();

    // Funktion för att skapa ett nytt konto
    // (med användar-ID och startbalans)
    public void createAccount(int id, int startBalance){

        Account account = new Account(id, startBalance);
        accountList.add(account);
    }

    public Account getAccount(int id) {

        for (int i = 0; accountList.size() > i; i++){

            Account a = accountList.get(i);

            if(a.getId() == id){

                return a;
            }
        }
        return null;
    }

    public int getAccountBalance(int id) {

        Account account = getAccount(id);
        if(account == null){
            return -1;
        }
        return account.getBalance();
    }
}
