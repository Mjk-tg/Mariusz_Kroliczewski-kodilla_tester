package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void totalMachinesBalance(){
        Bank bank = new Bank();

        bank.getKrakowska().addNewCashOperations(100);
        bank.getKrakowska().addNewCashOperations(300);
        bank.getZagorska().addNewCashOperations(100);
        bank.getZagorska().addNewCashOperations(-500);
        bank.getZagorska().addNewCashOperations(-400);
        bank.getHala().addNewCashOperations(600);
        bank.getHala().addNewCashOperations(-800);
        bank.getPilsudskiego().addNewCashOperations(100);
        bank.getRatuszowa().addNewCashOperations(-100);
        bank.getGwarek().addNewCashOperations(300);

        int totalBalance = bank.totalMachinesBalance();
        assertEquals(-300,totalBalance);
    }

    @Test
    public void totalMachinesBalanceIfNoOperations(){
        Bank bank = new Bank();

        bank.getKrakowska().addNewCashOperations(0);
        bank.getKrakowska().addNewCashOperations(0);
        bank.getZagorska().addNewCashOperations(0);
        bank.getZagorska().addNewCashOperations(0);
        bank.getZagorska().addNewCashOperations(0);
        bank.getHala().addNewCashOperations(0);
        bank.getHala().addNewCashOperations(0);
        bank.getPilsudskiego().addNewCashOperations(0);
        bank.getRatuszowa().addNewCashOperations(0);
        bank.getGwarek().addNewCashOperations(0);

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

        bank.getKrakowska().addNewCashOperations(100);
        bank.getKrakowska().addNewCashOperations(300);
        bank.getZagorska().addNewCashOperations(100);
        bank.getZagorska().addNewCashOperations(-500);
        bank.getZagorska().addNewCashOperations(-400);
        bank.getHala().addNewCashOperations(600);
        bank.getHala().addNewCashOperations(-800);
        bank.getPilsudskiego().addNewCashOperations(100);
        bank.getRatuszowa().addNewCashOperations(-100);
        bank.getGwarek().addNewCashOperations(300);

        int withdrawalCounter = bank.cashWithdrawalCounter();
        assertEquals(4, withdrawalCounter);
    }

    @Test
    public void cashWithdrawalCounterIfNoWithdrawal(){
        Bank bank = new Bank();

        bank.getKrakowska().addNewCashOperations(100);
        bank.getKrakowska().addNewCashOperations(300);
        bank.getZagorska().addNewCashOperations(100);
        bank.getZagorska().addNewCashOperations(500);
        bank.getZagorska().addNewCashOperations(400);
        bank.getHala().addNewCashOperations(600);
        bank.getHala().addNewCashOperations(800);
        bank.getPilsudskiego().addNewCashOperations(100);
        bank.getRatuszowa().addNewCashOperations(100);
        bank.getGwarek().addNewCashOperations(300);

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

        bank.getKrakowska().addNewCashOperations(100);
        bank.getKrakowska().addNewCashOperations(300);
        bank.getZagorska().addNewCashOperations(100);
        bank.getZagorska().addNewCashOperations(-500);
        bank.getZagorska().addNewCashOperations(-400);
        bank.getHala().addNewCashOperations(600);
        bank.getHala().addNewCashOperations(-800);
        bank.getPilsudskiego().addNewCashOperations(100);
        bank.getRatuszowa().addNewCashOperations(-100);
        bank.getGwarek().addNewCashOperations(300);

        int paymentCounter = bank.cashPaymentCounter();
        assertEquals(6, paymentCounter);
    }

    @Test
    public void cashPaymentCounterIfNoPayments() {
        Bank bank = new Bank();

        bank.getKrakowska().addNewCashOperations(-100);
        bank.getKrakowska().addNewCashOperations(-300);
        bank.getZagorska().addNewCashOperations(-100);
        bank.getZagorska().addNewCashOperations(-500);
        bank.getZagorska().addNewCashOperations(-400);
        bank.getHala().addNewCashOperations(-600);
        bank.getHala().addNewCashOperations(-800);
        bank.getPilsudskiego().addNewCashOperations(-100);
        bank.getRatuszowa().addNewCashOperations(-100);
        bank.getGwarek().addNewCashOperations(-300);

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

        bank.getKrakowska().addNewCashOperations(100);
        bank.getKrakowska().addNewCashOperations(300);
        bank.getZagorska().addNewCashOperations(100);
        bank.getZagorska().addNewCashOperations(-500);
        bank.getZagorska().addNewCashOperations(-400);
        bank.getHala().addNewCashOperations(600);
        bank.getHala().addNewCashOperations(-800);
        bank.getPilsudskiego().addNewCashOperations(100);
        bank.getRatuszowa().addNewCashOperations(-100);
        bank.getGwarek().addNewCashOperations(300);

        assertEquals(-450, bank.averageCashWithdrawal());
    }

    @Test
    public void averageCashWithdrawalIfNoWithdrawals(){
        Bank bank = new Bank();

        bank.getKrakowska().addNewCashOperations(0);
        bank.getKrakowska().addNewCashOperations(0);
        bank.getZagorska().addNewCashOperations(0);
        bank.getZagorska().addNewCashOperations(0);
        bank.getZagorska().addNewCashOperations(0);
        bank.getHala().addNewCashOperations(0);
        bank.getHala().addNewCashOperations(0);
        bank.getPilsudskiego().addNewCashOperations(0);
        bank.getRatuszowa().addNewCashOperations(0);
        bank.getGwarek().addNewCashOperations(0);

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

        bank.getKrakowska().addNewCashOperations(100);
        bank.getKrakowska().addNewCashOperations(300);
        bank.getZagorska().addNewCashOperations(100);
        bank.getZagorska().addNewCashOperations(-500);
        bank.getZagorska().addNewCashOperations(-400);
        bank.getHala().addNewCashOperations(600);
        bank.getHala().addNewCashOperations(-800);
        bank.getPilsudskiego().addNewCashOperations(100);
        bank.getRatuszowa().addNewCashOperations(-100);
        bank.getGwarek().addNewCashOperations(300);

        assertEquals(250, bank.averageCashPayment());
    }

    @Test
    public void averageCashPaymentIfNoPayments(){
        Bank bank = new Bank();

        bank.getKrakowska().addNewCashOperations(0);
        bank.getKrakowska().addNewCashOperations(0);
        bank.getZagorska().addNewCashOperations(0);
        bank.getZagorska().addNewCashOperations(0);
        bank.getZagorska().addNewCashOperations(0);
        bank.getHala().addNewCashOperations(0);
        bank.getHala().addNewCashOperations(0);
        bank.getPilsudskiego().addNewCashOperations(0);
        bank.getRatuszowa().addNewCashOperations(0);
        bank.getGwarek().addNewCashOperations(0);

        assertEquals(0, bank.averageCashPayment());
    }

    @Test
    public void averageCashPaymentIfNoCashMachines(){
        Bank bank = new Bank();

        assertEquals(0, bank.averageCashPayment());
    }
}
