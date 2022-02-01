package com.kodilla.bank.homework;

public class BankApplication {
    public static void main(String[] args) {

        CashMachine bankomat = new CashMachine();
        CashMachine bankomat1 = new CashMachine();
        CashMachine bankomat2 = new CashMachine();
        Bank kubaBank = new Bank();

        addValueToCashMashine(bankomat, 500, -100, 10, 200);
        addValueToCashMashine(bankomat1, 201, -10, 10, -20);
        addValueToCashMashine(bankomat2, 550, 150, -100, -20);

        kubaBank.addCashMachine(bankomat);
        kubaBank.addCashMachine(bankomat1);
        kubaBank.addCashMachine(bankomat2);

        System.out.println(kubaBank.getBalanceOfAllCashMachines());
        System.out.println(kubaBank.getPayment(bankomat));
        System.out.println(kubaBank.getPaymentOfAllCashMachines());
        System.out.println(kubaBank.getPayoffOfAllCashMachines());

        System.out.println(kubaBank.getAvgPayment(bankomat1));
        System.out.println(kubaBank.getAvgPayoff(bankomat1));
        System.out.println(kubaBank.getPayoff(bankomat));
    }

    private static void addValueToCashMashine(CashMachine bankomat, int value, int value1, int value2, int value3) {
        bankomat.addTransaction(value);
        bankomat.addTransaction(value1);
        bankomat.addTransaction(value2);
        bankomat.addTransaction(value3);
    }
}
