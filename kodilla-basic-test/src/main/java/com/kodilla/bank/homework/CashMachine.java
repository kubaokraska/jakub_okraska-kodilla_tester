package com.kodilla.bank.homework;

public class CashMachine {
    private int[] cashMachineTab;
    private int cashMachineSize;

    public CashMachine() {
        this.cashMachineSize = 0;
        this.cashMachineTab = new int[0];
    }

    public void addTransaction(int value) {
        if (getBalance() + value >= 0) {
            this.cashMachineSize++;
            int[] newTab = new int[this.cashMachineSize];
            System.arraycopy(cashMachineTab, 0, newTab, 0, cashMachineTab.length);
            newTab[this.cashMachineSize - 1] = value;

            this.cashMachineTab = newTab;
        } else {
            System.out.println("Cash Machine has not enough money");
        }
    }

    public int getBalance() {
        int sum = 0;
        for (int i = 0; i < cashMachineSize; i++)
            sum = sum + cashMachineTab[i];

        return sum;
    }

    public int getNumberOfTrans() {
        return cashMachineSize;
    }

    public int[] getCashMachineTab() {
        return cashMachineTab;
    }

    public int getCashMachineSize() {
        return cashMachineSize;
    }
}