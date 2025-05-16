import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import se.tddproject.base.Bank;
import se.tddproject.base.User;
import se.tddproject.moneystorage.TransactionHistory;

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
        user.getMoneyStorage().transferTo(bank.getAccount(/*id*/ 2).getMoneyStorage(), 20, "testUser", "account");
        assertEquals(20, bank.getAccountBalance(2));
        assertEquals(30, user.getMoneyStorage().getBalance());
    }

    @Test
    void bothAccountsStoreReceipts(){
        Bank bank = new Bank();
        bank.createAccount(1, 1000); // id, startbalans
        bank.createAccount(2, 0); // id, startbalans
        bank.getAccount(/*id*/ 1).getMoneyStorage().transferTo(bank.getAccount(/*id*/ 2).getMoneyStorage(), 100, "BankAcc 1", "BankAcc 2");
        TransactionHistory th = bank.getAccount(/*id*/ 1).getMoneyStorage().getLastTransaction();
        assertEquals("me", th.getFromName());
        assertEquals("BankAcc 2", th.getToName());
        assertEquals(100, th.getAmount());

        th = bank.getAccount(/*id*/ 2).getMoneyStorage().getLastTransaction();
        assertEquals("BankAcc 1", th.getFromName());
        assertEquals("me", th.getToName());
        assertEquals(100, th.getAmount());
    }

}
