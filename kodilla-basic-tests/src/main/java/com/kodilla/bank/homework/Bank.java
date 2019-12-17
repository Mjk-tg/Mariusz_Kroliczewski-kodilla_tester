package com.kodilla.bank.homework;

public class Bank {
    public Bank(CashMachine krakowska, CashMachine zagorska, CashMachine pilsudskiego, CashMachine ratuszowa, CashMachine hala, CashMachine gwarek, CashMachine[] cashMachines) {
        this.krakowska = krakowska;
        this.zagorska = zagorska;
        this.pilsudskiego = pilsudskiego;
        this.ratuszowa = ratuszowa;
        this.hala = hala;
        this.gwarek = gwarek;
        this.cashMachines = cashMachines;
    }

    CashMachine krakowska = new CashMachine();
    CashMachine zagorska = new CashMachine();
    CashMachine pilsudskiego = new CashMachine();
    CashMachine ratuszowa = new CashMachine();
    CashMachine hala = new CashMachine();
    CashMachine gwarek = new CashMachine();

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
            if ( cashOperations[i]< 0) {
                withdrawalCounter = withdrawalCounter + cashOperations[i];
            } else {
                withdrawalCounter = withdrawalCounter + 0;
            }

        }
        return withdrawalCounter;
    }

    public int cashPaymentCounter(int withdrawalCounter){
        int paymentCounter = cashMachines.length - withdrawalCounter;
        return paymentCounter;
    }

    public int averageCashWithdrawal(){
        int averageWithdrawal =0;
        int totalWithdrawal = 0;
        for (int i=0; i < cashMachines.length; i++ ) {
        }

        return averageWithdrawal;
    }

    public int averageCashPayment(){
        int averagePayment=0;

        return averagePayment;
    }

}
