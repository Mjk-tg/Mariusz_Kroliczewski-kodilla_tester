package com.kodilla.bank.homework;

public class Bank {

    private CashMachine krakowska;
    private CashMachine zagorska;
    private CashMachine pilsudskiego;
    private CashMachine ratuszowa;
    private CashMachine hala;
    private CashMachine gwarek;
    private CashMachine[] cashMachines;

    public Bank() {
        this.krakowska = new CashMachine();
        this.zagorska = new CashMachine();
        this.pilsudskiego = new CashMachine();
        this.ratuszowa = new CashMachine();
        this.hala = new CashMachine();
        this.gwarek = new CashMachine();
        this.cashMachines = new CashMachine[]{krakowska, zagorska, pilsudskiego, ratuszowa, hala, gwarek};
    }


    public int totalMachinesBalance(){
        int totalBalance = 0;
        for (int i=0; i < cashMachines.length; i++ ){
            totalBalance = totalBalance + cashMachines[i].getBalance();
        }
        return totalBalance;
    }

    public int cashWithdrawalCounter(){
        int withdrawalCounter=0;
            for (int i=0; i < cashMachines.length; i++ ){
                for (int n=0; n<cashMachines[i].getSize(); n++) {
                    int cashOperation = cashMachines[i].getCashOperation(n);
                    if (cashOperation < 0) {
                        withdrawalCounter = withdrawalCounter +1;
                    }
                }
            }
            return withdrawalCounter;
    }

    public int cashPaymentCounter(){
        int paymentCounter = 0;
        for (int i=0; i < cashMachines.length; i++ ){
            for (int n=0; n < cashMachines[i].getSize(); n++){
                int cashOperation = cashMachines[i].getCashOperation(n);
                if (cashOperation > 0) {
                    paymentCounter = paymentCounter +1;
                }
            }
        }
        return paymentCounter;
    }

    public int averageCashWithdrawal(){
        int totalWithdrawal = 0;
        for (int i=0; i < cashMachines.length; i++ ) {
            int[] cashOperations = cashMachines[i].getCashOperations();
            for (int n=0; n < cashOperations.length; n++) {
                if (cashOperations[n] < 0) {
                    totalWithdrawal = totalWithdrawal + cashOperations[n];
                }
            }
        }
        int averageWithdrawal;
        if (cashWithdrawalCounter() == 0) {
            averageWithdrawal=0;
        } else {
            averageWithdrawal = totalWithdrawal / cashWithdrawalCounter();
        }
        return averageWithdrawal;
    }

    public int averageCashPayment(){
        int totalPayment = 0;
        for (int i=0; i < cashMachines.length; i++ ) {
            int[] cashOperations = cashMachines[i].getCashOperations();
            for (int n=0; n < cashOperations.length; n++) {
                if (cashOperations[n] > 0) {
                    totalPayment = totalPayment + cashOperations[n];
                }
            }
        }
        int averagePayment;
        if (cashPaymentCounter() == 0) {
            averagePayment=0;
            } else {
                averagePayment = totalPayment / cashPaymentCounter();
        }
        return averagePayment;
    }

    public CashMachine getKrakowska() {
        return krakowska;
    }

    public CashMachine getZagorska() {
        return zagorska;
    }

    public CashMachine getPilsudskiego() {
        return pilsudskiego;
    }

    public CashMachine getRatuszowa() {
        return ratuszowa;
    }

    public CashMachine getHala() {
        return hala;
    }

    public CashMachine getGwarek() {
        return gwarek;
    }

    public CashMachine[] getCashMachines() {
        return cashMachines;
    }
}
