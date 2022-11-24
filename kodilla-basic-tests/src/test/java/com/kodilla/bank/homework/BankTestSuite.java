package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class BankTestSuite {
    @Test
    public void shouldHaveZeroLenght() {
        Bank theBank = new Bank();
        theBank.getNumberOfMachines();
        assertEquals(0, theBank.getNumberOfMachines());

    }

}