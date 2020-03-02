package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void totalMachinesBalance(){
        Bank bank = new Bank();

        bank.krakowska.newCashOperations(100);
        bank.krakowska.newCashOperations(300);
        bank.zagorska.newCashOperations(100);
        bank.zagorska.newCashOperations(-500);
        bank.zagorska.newCashOperations(-400);
        bank.hala.newCashOperations(600);
        bank.hala.newCashOperations(-800);
        bank.pilsudskiego.newCashOperations(100);
        bank.ratuszowa.newCashOperations(-100);
        bank.gwarek.newCashOperations(300);

        int totalBalance = bank.totalMachinesBalance();
        assertEquals(-300,totalBalance);
    }

    @Test
    public void totalMachinesBalanceIfNoOperations(){
        Bank bank = new Bank();

        bank.krakowska.newCashOperations(0);
        bank.krakowska.newCashOperations(0);
        bank.zagorska.newCashOperations(0);
        bank.zagorska.newCashOperations(0);
        bank.zagorska.newCashOperations(0);
        bank.hala.newCashOperations(0);
        bank.hala.newCashOperations(0);
        bank.pilsudskiego.newCashOperations(0);
        bank.ratuszowa.newCashOperations(0);
        bank.gwarek.newCashOperations(0);

        int totalBalance = bank.totalMachinesBalance();
        assertEquals(0,totalBalance);
    }

    @Test
    public void totalMachinesBalanceIfNoCashMachines(){
        Bank bank = new Bank();

        int totalBalance = bank.totalMachinesBalance();
        assertEquals(0,totalBalance);
    }

    @Test
    public void cashWithdrawalCounter(){
        Bank bank = new Bank();

        bank.krakowska.newCashOperations(100);
        bank.krakowska.newCashOperations(300);
        bank.zagorska.newCashOperations(100);
        bank.zagorska.newCashOperations(-500);
        bank.zagorska.newCashOperations(-400);
        bank.hala.newCashOperations(600);
        bank.hala.newCashOperations(-800);
        bank.pilsudskiego.newCashOperations(100);
        bank.ratuszowa.newCashOperations(-100);
        bank.gwarek.newCashOperations(300);

        int withdrawalCounter = bank.cashWithdrawalCounter();
        assertEquals(4, withdrawalCounter);
    }

    @Test
    public void cashWithdrawalCounterIfNoWithdrawal(){
        Bank bank = new Bank();

        bank.krakowska.newCashOperations(100);
        bank.krakowska.newCashOperations(300);
        bank.zagorska.newCashOperations(100);
        bank.zagorska.newCashOperations(500);
        bank.zagorska.newCashOperations(400);
        bank.hala.newCashOperations(600);
        bank.hala.newCashOperations(800);
        bank.pilsudskiego.newCashOperations(100);
        bank.ratuszowa.newCashOperations(100);
        bank.gwarek.newCashOperations(300);

        int withdrawalCounter = bank.cashWithdrawalCounter();
        assertEquals(0, withdrawalCounter);
    }

    @Test
    public void cashWithdrawalCounterIfNoCashMachines(){
        Bank bank = new Bank();

        int withdrawalCounter = bank.cashWithdrawalCounter();
        assertEquals(0, withdrawalCounter);
    }

    @Test
    public void cashPaymentCounter() {
        Bank bank = new Bank();

        bank.krakowska.newCashOperations(100);
        bank.krakowska.newCashOperations(300);
        bank.zagorska.newCashOperations(100);
        bank.zagorska.newCashOperations(-500);
        bank.zagorska.newCashOperations(-400);
        bank.hala.newCashOperations(600);
        bank.hala.newCashOperations(-800);
        bank.pilsudskiego.newCashOperations(100);
        bank.ratuszowa.newCashOperations(-100);
        bank.gwarek.newCashOperations(300);

        int paymentCounter = bank.cashPaymentCounter();
        assertEquals(6, paymentCounter);
    }

    @Test
    public void cashPaymentCounterIfNoPayments() {
        Bank bank = new Bank();

        bank.krakowska.newCashOperations(-100);
        bank.krakowska.newCashOperations(-300);
        bank.zagorska.newCashOperations(-100);
        bank.zagorska.newCashOperations(-500);
        bank.zagorska.newCashOperations(-400);
        bank.hala.newCashOperations(-600);
        bank.hala.newCashOperations(-800);
        bank.pilsudskiego.newCashOperations(-100);
        bank.ratuszowa.newCashOperations(-100);
        bank.gwarek.newCashOperations(-300);

        int paymentCounter = bank.cashPaymentCounter();
        assertEquals(0, paymentCounter);
    }

    @Test
    public void cashPaymentCounterIfNoCashMachines() {
        Bank bank = new Bank();

        int paymentCounter = bank.cashPaymentCounter();
        assertEquals(0, paymentCounter);
    }

    @Test
    public void averageCashWithdrawal(){
        Bank bank = new Bank();

        bank.krakowska.newCashOperations(100);
        bank.krakowska.newCashOperations(300);
        bank.zagorska.newCashOperations(100);
        bank.zagorska.newCashOperations(-500);
        bank.zagorska.newCashOperations(-400);
        bank.hala.newCashOperations(600);
        bank.hala.newCashOperations(-800);
        bank.pilsudskiego.newCashOperations(100);
        bank.ratuszowa.newCashOperations(-100);
        bank.gwarek.newCashOperations(300);

        assertEquals(-450, bank.averageCashWithdrawal());
    }

    @Test
    public void averageCashWithdrawalIfNoWithdrawals(){
        Bank bank = new Bank();

        bank.krakowska.newCashOperations(0);
        bank.krakowska.newCashOperations(0);
        bank.zagorska.newCashOperations(0);
        bank.zagorska.newCashOperations(0);
        bank.zagorska.newCashOperations(0);
        bank.hala.newCashOperations(0);
        bank.hala.newCashOperations(0);
        bank.pilsudskiego.newCashOperations(0);
        bank.ratuszowa.newCashOperations(0);
        bank.gwarek.newCashOperations(0);

        assertEquals(0, bank.averageCashWithdrawal());
    }

    @Test
    public void averageCashWithdrawalIfNoCashMachines(){
        Bank bank = new Bank();

        assertEquals(0, bank.averageCashWithdrawal());
    }


    @Test
    public void averageCashPayment(){
        Bank bank = new Bank();

        bank.krakowska.newCashOperations(100);
        bank.krakowska.newCashOperations(300);
        bank.zagorska.newCashOperations(100);
        bank.zagorska.newCashOperations(-500);
        bank.zagorska.newCashOperations(-400);
        bank.hala.newCashOperations(600);
        bank.hala.newCashOperations(-800);
        bank.pilsudskiego.newCashOperations(100);
        bank.ratuszowa.newCashOperations(-100);
        bank.gwarek.newCashOperations(300);

        assertEquals(250, bank.averageCashPayment());
    }

    @Test
    public void averageCashPaymentIfNoPayments(){
        Bank bank = new Bank();

        bank.krakowska.newCashOperations(0);
        bank.krakowska.newCashOperations(0);
        bank.zagorska.newCashOperations(0);
        bank.zagorska.newCashOperations(0);
        bank.zagorska.newCashOperations(0);
        bank.hala.newCashOperations(0);
        bank.hala.newCashOperations(0);
        bank.pilsudskiego.newCashOperations(0);
        bank.ratuszowa.newCashOperations(0);
        bank.gwarek.newCashOperations(0);

        assertEquals(0, bank.averageCashPayment());
    }

    @Test
    public void averageCashPaymentIfNoCashMachines(){
        Bank bank = new Bank();

        assertEquals(0, bank.averageCashPayment());
    }
}
