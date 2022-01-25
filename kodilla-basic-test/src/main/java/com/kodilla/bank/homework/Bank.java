package com.kodilla.bank.homework;

public class Bank {
    public CashMachine[] cashMachines;
    public int cashMachinesNumber;

    public Bank() {
        this.cashMachinesNumber = 0;
        this.cashMachines = new CashMachine[0];
    }

    public void addCashMachine(CashMachine cashMachines) {
        this.cashMachinesNumber++;
        CashMachine[] newTab = new CashMachine[this.cashMachinesNumber];
        System.arraycopy(this.cashMachines, 0, newTab, 0, this.cashMachines.length);
        newTab[this.cashMachinesNumber - 1] = cashMachines;

        this.cashMachines = newTab;
    }

    public int getBalanceOfAllCashMachine() {
        int sum = 0;
        for (int i = 0; i < cashMachinesNumber; i++)
            sum = sum + cashMachines[i].getBalance();

        return sum;
    }


    public double getAvgPayment(CashMachine cashMachines) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < cashMachines.cashMachineSize; i++) {
            if (cashMachines.cashMachineTab[i] > 0) {
                sum = sum + cashMachines.cashMachineTab[i];
                count++;
            }
        }
        return sum / count;
    }

    public double getAvgPayoff(CashMachine cashMachines) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < cashMachines.cashMachineSize; i++) {
            if (cashMachines.cashMachineTab[i] < 0) {
                sum = sum + cashMachines.cashMachineTab[i];
                count++;
            }
        }
        return sum / count;
    }

    public int getPayment(CashMachine cashMachines) {
        int sum = 0;
        for (int i = 0; i < cashMachines.cashMachineSize; i++) {
            if (cashMachines.cashMachineTab[i] > 0) {
                sum++;
            }
        }
        return sum;
    }

    public int getPayoff(CashMachine cashMachines) {
        int sum = 0;
        for (int i = 0; i < cashMachines.cashMachineSize; i++) {
            if (cashMachines.cashMachineTab[i] < 0) {
                sum++;
            }
        }
        return sum;
    }

    ////////////////////////// DODATKOWO //////////////////////////////////////////
    public int getPaymentOfAllCashMachine() {
        int sum = 0;
        for (int i = 0; i < cashMachinesNumber; i++) {
            for (int x = 0; x < cashMachines[i].cashMachineSize; x++) {
                if (cashMachines[i].cashMachineTab[x] > 0) {
                    sum++;
                }
            }
        }
        return sum;
    }

    public int getPayoffOfAllCashMachine() {
        int sum = 0;
        for (int i = 0; i < cashMachinesNumber; i++) {
            for (int x = 0; x < cashMachines[i].cashMachineSize; x++) {
                if (cashMachines[i].cashMachineTab[x] < 0) {
                    sum++;
                }
            }
        }
        return sum;
    }
}