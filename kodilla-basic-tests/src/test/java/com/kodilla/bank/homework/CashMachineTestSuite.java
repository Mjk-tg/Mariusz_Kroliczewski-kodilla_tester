package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void arrayCashMachineHaveNoData(){
        CashMachine cashMachine = new CashMachine();
        int[] cashOperations = cashMachine.getCashOperations();
        assertEquals(0,cashOperations.length);
    }

    @Test
    public void shouldAddThreeOperationsToArray(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.newCashOperations(100);
        cashMachine.newCashOperations(-200);
        cashMachine.newCashOperations(500);

        int[] cashOperations = cashMachine.getCashOperations();
        assertEquals(3,cashOperations.length);
        assertEquals(100,cashOperations[0]);
        assertEquals(-200,cashOperations[1]);
        assertEquals(500,cashOperations[2]);
    }
    @Test
    public void shouldCountMachineBalans(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.newCashOperations(100);
        cashMachine.newCashOperations(-200);
        cashMachine.newCashOperations(500);
        assertEquals(400,cashMachine.getBalance());
    }

    @Test
    public void shouldCountNumberOfOperations(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.newCashOperations(100);
        cashMachine.newCashOperations(-200);
        cashMachine.newCashOperations(500);
        cashMachine.newCashOperations(1500);
        assertEquals(4,cashMachine.getOperationsCounter());
    }
}
