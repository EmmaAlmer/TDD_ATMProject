import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    public void recieptCreatedWhenDepositingMoney(){
        Account account = new Account(1, 100);
        account.withdraw(100, "testPocket");
        TransactionHistory th = account.getLastReciept();
        assertEquals(th.getFromName(), "me");
        assertEquals(th.getToName(), "testPocket");
        assertEquals(th.getAmount(), 100);
    }
}
