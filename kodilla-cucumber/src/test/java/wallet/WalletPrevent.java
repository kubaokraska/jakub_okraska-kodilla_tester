package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletPrevent implements En {
    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();

    public WalletPrevent() {
        Given("there is $100 in my wallet", () -> {
            Wallet wallet = new Wallet();
            wallet.deposit(100);
            Assert.assertEquals("Incorrect wallet balance", 100, wallet.getBalance());
        });

        When("I withdraw $200", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 200);
        });

        Then("nothing should be dispensed", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });

        Then("I should be told that I don't have enough money in my wallet", () -> {
            Assert.assertEquals("Not enough money in your wallet", "Not enough money in your wallet");
        });
    }
}