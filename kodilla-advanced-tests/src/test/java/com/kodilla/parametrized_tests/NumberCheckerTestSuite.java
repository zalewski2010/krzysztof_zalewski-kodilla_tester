package com.kodilla.parametrized_tests;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberCheckerTestSuite {

    private NumberChecker numberChecker = new NumberChecker();

    @Test
    public void shouldReturnTrueIfNumberEqualsThree() {
        boolean result = numberChecker.isDivisibleByThree(3);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueIfNumberIsAMultipleOfThree() {
        boolean result = numberChecker.isDivisibleByThree(12);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueIfNumberIsEqualsZero() {
        boolean result = numberChecker.isDivisibleByThree(0);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueIfNumberIsANegativeMultipleOfThree() {
        boolean result = numberChecker.isDivisibleByThree(-6);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseIfNumberIsNotDivisibleByThree() {
        boolean result = numberChecker.isDivisibleByThree(2);
        assertFalse(result);
    }




        @ParameterizedTest
        @ValueSource(ints = {0, 3, 6, -3, -12, 15})
        public void shouldReturnTrueForNumberDivisibleByThree(int number) {
            boolean result = numberChecker.isDivisibleByThree(number);
            assertTrue(result);
        }

        @ParameterizedTest
        @ValueSource(ints = {-2, -1, 1, 2, 4, 5})
        public void shouldReturnFalseForNumberNotDivisibleByThree(int number) {
            boolean result = numberChecker.isDivisibleByThree(number);
            assertFalse(result);
        }
}

 // w value source można wstawić te typy:
    // short (@ValueSource(shorts = {-2, 0, 1}))
   // byte (@ValueSource(bytes = {-2, 0, 1}))
   // int (@ValueSource(ints = {-2, 0, 1}))
   // long (@ValueSource(longs = {-2L, 0L, 1L}))
   // float (@ValueSource(floats = {-2.1f, 0.6f, 1.9f}))
   //double (@ValueSource(doubles = {-2.1, 0.6, 1.9}))

    //java.lang.String (@ValueSource(strings = {"test", "value"}))
        //java.lang.Class (@ValueSource(classes = {NumberChecker.class}))

//// char (@ValueSource po angielsku (chars = {wpisz litere w nawiasie pojedynczym, wpisz litere w nawiasie pojedynczym}))///