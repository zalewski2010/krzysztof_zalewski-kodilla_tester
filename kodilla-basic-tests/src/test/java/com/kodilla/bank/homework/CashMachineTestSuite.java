package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import school.Student;

import static com.kodilla.bank.homework.CashMachine.transactionsIncome;
import static com.kodilla.bank.homework.CashMachine.transactionsOutcome;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void testGetBalance() {
        CashMachine cashMachine = new CashMachine();
        int transactionsIncome = 5;
        int transactionsOutcome = 8;
        double sumResult = getBalance().sum(transactionsIncome, transactionsOutcome);
        assertEquals(13, sumResult);
    }

    private Double getBalance() {
        return null;
    }

    @Test
    public void getAverageAddTransactions() {
        CashMachine cashMachine = new CashMachine();
        double sumIn = 200;
        double averageAdd = sumIn / transactionsIncome.length;
        assertEquals(20, averageAdd);
    }

    @Test
    public void getAverageWithdrawTransactions() {
        CashMachine cashMachine = new CashMachine();
        double sumOut = -100;
        double averageWithdraw = sumOut / transactionsOutcome.length;
        assertEquals(-10, averageWithdraw);

    }

    @Test
    public void getCountTransactions() {
        CashMachine cashMachine = new CashMachine();
        double countTransactions = transactionsIncome.length + transactionsOutcome.length;
        assertEquals(20, countTransactions);
    }

    @Test
    public void shouldCalculateAverage() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(153);
        assertEquals(15.30, cashMachine.getAverageAddTransaction(), 0.01);
    }

    @Test
    public void getCountAddTransaction() {
        CashMachine cashMachine = new CashMachine();
        int getCountAddTransaction = transactionsIncome.length;
        assertEquals(11, getCountAddTransaction);
    }
}
