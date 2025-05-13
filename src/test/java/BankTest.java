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

    @Test
    void nonExistantAccountDoesntExistTest(){
        Bank bank = new Bank();
        bank.createAccount(1, 0); // id, startbalans
        assertNull(bank.getAccount(2));
    }

    @Test
    void storeMoneyTest(){
        Bank bank = new Bank();
        bank.createAccount(2, 0); // id, startbalans
        User user = new User(50);
        user.getMoneyStorage().transferTo(bank.getAccount(/*id*/ 2).getMoneyStorage(), 20);
        assertEquals(20, bank.getAccountBalance(2));
        //assertEquals(30, user.getMoneyStorage().getBalance());
    }
}
