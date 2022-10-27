package com.kodilla.bank.homework;


import java.util.Arrays;

public class CashMachine {

    private double transaction; // transakcje (tu metoda)

    private double balance; // stan konta/bilans (tu metoda)
    private double income; // wpłatay;
    private double expend; // wypłaty


    public CashMachine(double balance, double income, double expend) {
        this.balance = balance;
        this.income = income;
        this.expend = expend;
    }

    public double getBalance() { // metoda zwraca stan konta
        return balance;
    }
    { long ile = Arrays.stream(transaction) // zwraca liczbę transakcji?
            .map(String::length)
            .count(); }

    public double getTransactionCount() { // metoda na liczbę transakcji?
        return transaction;
    }

    public void income(double amount) {
        double newBalance = balance + amount;
        balance = newBalance;
        transactionCount++;
    }

    public void expand(double amount) {
        double newBalance = balance - amount;
        balance = newBalance;
        transactionCount++;
    }
}

        private double stanKonta;
    private double count;

    CashMachine (double stanKonta){
        this.stanKonta = stanKonta; }

    public double stanKonta(){
        return stanKonta;
    }

    public void saldo(){
        System.out.println("Stan konta wynosi:" + stanKonta()); }

    public int getCount()
    count=transakcje; {
        return count; }



    //        Ma ona zawierać tablicę ze zrealizowanymi transakcjami (liczbowa wartość dodatnia,
//        jeśli użytkownik wpłacił pieniądze i ujemna, jeśli użytkownik wypłacił pieniądze).
//        Dodaj metody zwracające saldo bankomatu oraz liczbę wykonanych transakcji.
