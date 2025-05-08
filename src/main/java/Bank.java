import java.util.ArrayList;

public class Bank {

    ArrayList <Account> accountList = new ArrayList<>();

    // Implementera funktion för att skapa ett nytt konto
    // (med användar-ID och startbalans)
    public void createAccount(int id, int startBalance){

        Account account = new Account(id, startBalance);
        accountList.add(account);
    }

    public int getAccountBalance(int id) {

        for (int i = 0; accountList.size() > i; i++){

            Account a = accountList.get(i);

            if(a.getId() == id){

                return a.getBalance();
            }
        }
        return -1;
    }
}
