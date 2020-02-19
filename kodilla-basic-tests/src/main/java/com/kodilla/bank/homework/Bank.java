package com.kodilla.bank.homework;

public class Bank {

    public CashMachine krakowska;
    public CashMachine zagorska;
    public CashMachine pilsudskiego;
    public CashMachine ratuszowa;
    public CashMachine hala;
    public CashMachine gwarek;

    public Bank() {
        this.krakowska = new CashMachine();
        this.zagorska = new CashMachine();
        this.pilsudskiego = new CashMachine();
        this.ratuszowa = new CashMachine();
        this.hala = new CashMachine();
        this.gwarek = new CashMachine();

    }
        CashMachine[] cashMachines = {krakowska, zagorska, pilsudskiego, ratuszowa, hala, gwarek};

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
                int[] cashOperations = cashMachines[i].getCashOperations();
                    for (int n=0; n < cashOperations.length; n++){
                    if ( cashOperations [n] < 0) {
                    withdrawalCounter = withdrawalCounter + cashOperations[n];
                }
            }
        }
        return withdrawalCounter;
    }

    public int cashPaymentCounter(){
        int paymentCounter = 0;
        for (int i=0; i < cashMachines.length; i++ ){
            int[] cashOperations = cashMachines[i].getCashOperations();
                for (int n=0; n < cashOperations.length; n++){
                if ( cashOperations[n]> 0) {
                    paymentCounter = paymentCounter + cashOperations[n];
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
        return totalWithdrawal / cashWithdrawalCounter();
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
        return totalPayment / cashPaymentCounter();
    }

}
