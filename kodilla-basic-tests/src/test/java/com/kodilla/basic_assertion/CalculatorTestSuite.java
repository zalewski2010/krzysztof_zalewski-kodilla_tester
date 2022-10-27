package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);

        Calculator calculator1 = new Calculator();
        int c = 4;
        int d = 2;
        int subResult = calculator.sub(c, d);
        assertEquals(2,subResult);

        Calculator calculator2 = new Calculator();
        double e = 2.2;
        Double n=2.1;
        assertEquals(5.2, Math.pow(e,n),0.1);
        { System.out.println(Math.pow(e,n));}

        Calculator calculator3 = new Calculator();
        double f = -2.4;
        double n1 = 3;
        assertEquals(-13.8, Math.pow(f,n1),0.1);
        { System.out.println(Math.pow(f,n1));}

        Calculator calculator4 = new Calculator();
        double g = 0;
         n = 2.1;
         assertEquals(0, Math.pow(g,n), 0.4);
        { System.out.println(Math.pow(g,n));}


    }
}
