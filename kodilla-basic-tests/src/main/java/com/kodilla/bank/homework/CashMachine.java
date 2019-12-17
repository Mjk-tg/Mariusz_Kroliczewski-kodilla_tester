package com.kodilla.bank.homework;

public class CashMachine {

    private int[] cashOperations;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.cashOperations = new int[0];

    }
    public void newCashOperations(int cashOperation) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(cashOperations, 0, newTab, 0, cashOperations.length);
        newTab[this.size - 1] = cashOperation;
        this.cashOperations = newTab;

    }

    public int[] getCashOperations() {
        return cashOperations;
    }

    public int getBalance(){
        int balance = 0;
        for (int n = 0; n < this.cashOperations.length; n++) {
            balance = balance + this.cashOperations[n];
        }
        return balance;
    }

    public int getOperationsCounter(){
        int counter = this.size;
        return counter;
    }

}
