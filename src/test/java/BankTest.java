import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BankTest {

    // Implementera funktion för att skapa ett nytt konto
    // (med användar-ID och startbalans)
    @Test
    void createAccountTest(){
        Bank bank = new Bank();
        bank.createAccount(10, 101); // id, startbalans
        assertEquals(101, bank.getAccountBalance(10));
    }
}
