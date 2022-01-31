package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    private CashMachine bankomat = new CashMachine();
    private CashMachine bankomat1 = new CashMachine();
    private CashMachine bankomat2 = new CashMachine();

    @Test
    public void testAddCashMachine() {
        Bank bank = new Bank();
        bank.addCashMachine(bankomat);
        bank.addCashMachine(bankomat1);
        bank.addCashMachine(bankomat2);
        assertEquals(3, bank.getCashMachinesNumber());
    }

    @Test
    public void testGetBalanceOfAllCashMachine() {
        Bank bank = new Bank();

        bankomat.addTransaction(300);
        bankomat.addTransaction(200);
        bankomat.addTransaction(-100);
        bankomat.addTransaction(-200);

        bankomat1.addTransaction(30);
        bankomat1.addTransaction(20);
        bankomat1.addTransaction(-10);
        bankomat1.addTransaction(-20);

        bankomat2.addTransaction(3000);
        bankomat2.addTransaction(2000);
        bankomat2.addTransaction(-1000);
        bankomat2.addTransaction(-20000); // Transakcja odrzucona

        bank.addCashMachine(bankomat);
        bank.addCashMachine(bankomat1);
        bank.addCashMachine(bankomat2);
        assertEquals(4220, bank.getBalanceOfAllCashMachine());
    }

    @Test
    public void testGetAvgPayment() {
        Bank bank = new Bank();

        bankomat.addTransaction(300);
        bankomat.addTransaction(200);
        bankomat.addTransaction(-500);
        bankomat.addTransaction(-200);

        bank.addCashMachine(bankomat);
        assertEquals(250, bank.getAvgPayment(bankomat), 0.1);
    }

    @Test
    public void testGetAvgPayoff() {
        Bank bank = new Bank();

        bankomat.addTransaction(200);
        bankomat.addTransaction(-300); // Transakcja anulowana
        bankomat.addTransaction(500);
        bankomat.addTransaction(-200);

        bankomat.addTransaction(-500); // Wypłata do 0
        bank.addCashMachine(bankomat);
        assertEquals(-350, bank.getAvgPayoff(bankomat), 0.1);
    }

    @Test
    public void testGetPayment() {
        Bank bank = new Bank();

        bankomat.addTransaction(200);
        bankomat.addTransaction(-300); // Transakcja anulowana
        bankomat.addTransaction(500);
        bankomat.addTransaction(-200);

        bankomat.addTransaction(-500); // Wypłata do 0
        bank.addCashMachine(bankomat);
        assertEquals(2, bank.getPayment(bankomat));
    }

    @Test
    public void testGetPayoff() {
        Bank bank = new Bank();

        bankomat.addTransaction(200);
        bankomat.addTransaction(-300); // Transakcja anulowana
        bankomat.addTransaction(500);
        bankomat.addTransaction(-200);

        bankomat.addTransaction(-500); // Wypłata do 0
        bank.addCashMachine(bankomat);
        assertEquals(2, bank.getPayoff(bankomat));
    }
}