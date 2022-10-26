package com.kodilla.basic_assertion;

public class AppSub {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 4;
        int b = 2;
        int subResult = calculator.sub(a, b);

        boolean correct = ResultChecker.assertEquals(2, subResult);

        if (correct) {
            System.out.println("Metoda sub działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sub nie działa poprawnie dla liczb " + a + " i " + b);
        }
    }
}
