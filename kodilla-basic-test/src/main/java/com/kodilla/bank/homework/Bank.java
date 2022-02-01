package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;
    private int cashMachinesNumber;

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

    public int getBalanceOfAllCashMachines() {
        int sum = 0;
        for (int i = 0; i < cashMachinesNumber; i++)
            sum = sum + cashMachines[i].getBalance();

        return sum;
    }

    public double getAvgPayment(CashMachine cashMachines) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < cashMachines.getCashMachineSize(); i++) {
            if (cashMachines.getCashMachineTab()[i] > 0) {
                sum = sum + cashMachines.getCashMachineTab()[i];
                count++;
            }
        }
        return sum / count;
    }

    public double getAvgPayoff(CashMachine cashMachines) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < cashMachines.getCashMachineSize(); i++) {
            if (cashMachines.getCashMachineTab()[i] < 0) {
                sum = sum + cashMachines.getCashMachineTab()[i];
                count++;
            }
        }
        return sum / count;
    }

    public int getPayment(CashMachine cashMachines) {
        int sum = 0;
        for (int i = 0; i < cashMachines.getCashMachineSize(); i++) {
            if (cashMachines.getCashMachineTab()[i] > 0) {
                sum++;
            }
        }
        return sum;
    }

    public int getPayoff(CashMachine cashMachines) {
        int sum = 0;
        for (int i = 0; i < cashMachines.getCashMachineSize(); i++) {
            if (cashMachines.getCashMachineTab()[i] < 0) {
                sum++;
            }
        }
        return sum;
    }

    ////////////////////////// DODATKOWO //////////////////////////////////////////
    public int getPaymentOfAllCashMachines() {
        int sum = 0;
        for (int i = 0; i < cashMachinesNumber; i++) {
            for (int x = 0; x < cashMachines[i].getCashMachineSize(); x++) {
                if (cashMachines[i].getCashMachineTab()[x] > 0) {
                    sum++;
                }
            }
        }
        return sum;
    }

    public int getPayoffOfAllCashMachines() {
        int sum = 0;
        for (int i = 0; i < cashMachinesNumber; i++) {
            for (int x = 0; x < cashMachines[i].getCashMachineSize(); x++) {
                if (cashMachines[i].getCashMachineTab()[x] < 0) {
                    sum++;
                }
            }
        }
        return sum;
    }

    public int getCashMachinesNumber() {
        return cashMachinesNumber;
    }
}