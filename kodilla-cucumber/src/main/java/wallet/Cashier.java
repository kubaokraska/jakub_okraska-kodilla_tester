package wallet;

public class Cashier {
    private CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        if (wallet.getBalance() >= amount) {
            cashSlot.dispense(amount);
            wallet.debit(amount);
        } else {
            cashSlot.dispense(0);
            sendMessage("Not enough money");
        }
    }

    public String sendMessage(String message) {
        return message;
    }
}
