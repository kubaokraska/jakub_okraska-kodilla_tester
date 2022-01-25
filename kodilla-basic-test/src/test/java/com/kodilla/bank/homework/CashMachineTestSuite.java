package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void testAddTransactionNumberOfElements() {
        CashMachine bankomat = new CashMachine();
        bankomat.addTransaction(500);
        bankomat.addTransaction(-600); // Transakcja odrzucona
        bankomat.addTransaction(100);

        assertEquals(2, bankomat.getNumberOfTrans());
    }
    @Test
    public void testAddTransactionLastTransaction() {
        CashMachine bankomat = new CashMachine();
        bankomat.addTransaction(500);
        bankomat.addTransaction(600);
        bankomat.addTransaction(-1100);

        bankomat.addTransaction(-600); // Transakcja odrzucona
        assertEquals(-1100, bankomat.cashMachineTab[2]);
    }
    @Test
    public void testGetBalance() {
        CashMachine bankomat = new CashMachine();
        bankomat.addTransaction(200);
        bankomat.addTransaction(-100);
        bankomat.addTransaction(-300); // Transakcja odrzucona

        assertEquals(100, bankomat.getBalance());
    }
    @Test
    public void testNumberOfTrans() {
        CashMachine bankomat = new CashMachine();
        bankomat.addTransaction(300);
        bankomat.addTransaction(200);
        bankomat.addTransaction(-500);

        bankomat.addTransaction(-300); // Transakcja odrzucona
        bankomat.addTransaction(300);
        assertEquals(4, bankomat.getNumberOfTrans());
    }
}