package wallet;
import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletDisplay implements En {
    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();

    public WalletDisplay() {
        Given("there is $100 in my wallet", () -> {
            Wallet wallet = new Wallet();
            wallet.deposit(100);
            Assert.assertEquals("Incorrect wallet balance", 100, wallet.getBalance());
        });

        When("I check the balance of my wallet", () -> {
            wallet.getBalance();
        });

        Then("I should see that the balance is $100", () -> {
            Assert.assertEquals(100, wallet.getBalance());
        });
    }
}