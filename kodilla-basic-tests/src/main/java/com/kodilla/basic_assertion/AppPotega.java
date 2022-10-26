package com.kodilla.basic_assertion;

public class AppPotega {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 2;
        int potega;
        int n=2;
        potega = (int) Math.pow(a,n);

        boolean correct = ResultChecker.assertEquals(4, (int) Math.pow(a,n));

        if (correct) {
            System.out.println("Metoda potęgi działa poprawnie dla liczb "  + a );
        } else {
            System.out.println("Metoda potegi nie działa poprawnie dla liczb " + a );
        }
        System.out.println(a+ " podniesione do potęgi " +n+ " wynosi:\n" + potega);
    }
}

