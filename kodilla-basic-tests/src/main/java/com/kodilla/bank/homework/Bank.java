package com.kodilla.bank.homework;

public class Bank {

    public CashMachine krakowska = new CashMachine();
    public CashMachine zagorska = new CashMachine();;
    public CashMachine pilsudskiego = new CashMachine();
    public CashMachine ratuszowa = new CashMachine();
    public CashMachine hala = new CashMachine();
    public CashMachine gwarek = new CashMachine();

    public Bank() {
        this.krakowska = krakowska;
        this.zagorska = zagorska;
        this.pilsudskiego = pilsudskiego;
        this.ratuszowa = ratuszowa;
        this.hala = hala;
        this.gwarek = gwarek;
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
}
