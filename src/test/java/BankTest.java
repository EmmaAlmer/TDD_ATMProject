import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BankTest {

    // Implementera funktion för att skapa ett nytt konto
    // (med användar-ID och startbalans)
    @Test
    void createAccount(){
        Bank bank = new Bank();
        bank.createUser(1, 100); // id, startbalans
        assertEquals(100, bank.getAccountBalance(1));
    }
}
