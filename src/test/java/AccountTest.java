import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import se.tddproject.base.Account;
import se.tddproject.moneystorage.TransactionHistory;

public class AccountTest {

    @Test
    public void recieptCreatedWhenDepositingMoney(){
        Account account = new Account(1, 100);
        account.getMoneyStorage().withdraw(100, "testPocket");
        TransactionHistory th = account.getMoneyStorage().getLastTransaction();
        assertEquals("me", th.getFromName());
        assertEquals("testPocket", th.getToName());
        assertEquals(100, th.getAmount());
    }
}
