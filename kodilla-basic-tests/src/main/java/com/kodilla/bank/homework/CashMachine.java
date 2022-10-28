package com.kodilla.bank.homework;


import java.util.Arrays;

public abstract class CashMachine {

    private final int transactions; // transakcje (tu metode zrobic)

    private final int balance; // stan konta/bilans (tu metode zrobic)
    private final int income; // wpłatay;
    private final int expend; // wypłaty


    public CashMachine(int balance, int income, int expend, int transactions) {
        this.balance = balance;
        this.income = income;
        this.expend = expend;
        this.transactions = transactions;
    }

    public double getBalance() { // metoda zwraca stan konta
        return balance;
    }

    public double getTransactionsCount() { // metoda na liczbę transakcji?
        return transactions;
    }

    public void income(double amount) {
        double newBalance = balance + amount;
        balance = newBalance;
        transactionsCount++;
    }

    public void expand(double amount) {
        double newBalance = balance - amount;
        balance = newBalance;
        transactionsCount++;
    }
}

        private double stanKonta;
    private double count;

    CashMachine (double stanKonta){
        this.stanKonta = stanKonta; }



    public void balance(){
        System.out.println("Stan konta wynosi:" + balance()); }




    //        Ma ona zawierać tablicę ze zrealizowanymi transakcjami (liczbowa wartość dodatnia,
//        jeśli użytkownik wpłacił pieniądze i ujemna, jeśli użytkownik wypłacił pieniądze).
//        Dodaj metody zwracające saldo bankomatu oraz liczbę wykonanych transakcji.



   //         { long ile = Arrays.stream(getTransactionsCount()) // zwraca liczbę transakcji?
     //       .map(String::length)
      //      .count(); }


//public Grades() {  // stworzenie tablicy z zerową liczbą ocen (czyli nie można jej powiekszyć)
//        this.size=0;
//        this.values = new int[0];
//    }
//
//    public void add(int value) { // metoda tworzy pusta tablice , o jeden większą niż poprzednia+skopiowanie jej elementów+ nowa wartość na koniec
//        this.size++; // zwiększa o jeden
//        int[] newTab = new int[this.size];
//        System.arraycopy(values, 0, newTab, 0, values.length); // metoda klasy system(kopiuje tablice zródłową do docelowej,zachowując układ elementów)
//        newTab[this.size - 1] = value; // przypisujemy nową wartość do ostatniego elementu w tablicy (konieczne było odjęcie cyfry jeden od rozmiaru tablicy, indeksy liczymy od zera)
//        this.values = newTab; // przypisanie nowo utworzonej tablicy do tablicy przechowywanej w klasie


// double sum = 0;
//        for(int i = 0; i < this.values.length; i++) {
//            sum += this.values[i];
//        }
//        return sum/this.values.length;
//    }