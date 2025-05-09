import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BankTest {

    // Implementera funktion för att skapa ett nytt konto
    // (med användar-ID och startbalans)
    @Test
    void createAccountTest(){
        Bank bank = new Bank();
        bank.createAccount(1, 100); // id, startbalans
        assertEquals(100, bank.getAccountBalance(1));
    }

    //Tanken var att lagra pengar, men blev en transaktion istället
    @Test
    void storeMoneyTest(){
        Bank bank = new Bank();
        bank.createAccount(2, 0); // id, startbalans
        User user = new User(50);
        bank.transferToAccount(bank.getAccount(/*id*/ 2), user, 20);
        assertEquals(20, bank.getAccountBalance(2));
    }

    //Från account till cash
    @Test
    void withdrawMoneyTest(){
        Bank bank = new Bank();
        bank.createAccount(3, 150);
        User user = new User(0);
        bank.transferFromAccount(bank.getAccount(3), user, 50);
        assertEquals(50, user.getCash());
    }

    //Historik över transaktioner, insättning samt utdrag
    @Test
    void transactionHistoryTest(){
        Bank bank = new Bank();
        bank.createAccount(3, 150);
        User user = new User(0);
    }
}
