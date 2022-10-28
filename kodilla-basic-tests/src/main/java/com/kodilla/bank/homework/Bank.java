package com.kodilla.bank.homework;


public class Bank extends CashMachine{
    public void Bank(){
        super("driver" ,"1.Driving, 2.Selling ice cream", 2000);
}

    public double getIncome() { //metody na średnią wpłat
        return this.getAverage();
}

    public double getExpend() { //metody na średnią wypłat
        return this.getAverage();
    }

    public double CashMachine.getBalance() { // metoda zwraca stan konta
        return balance;

// metody zwracające
//całkowity bilans ze wszystkich bankomatów,
//liczbę transakcji związanych z wypłatą,
//liczbę transakcji związaną z wpłatą pieniędzy,
//średnią wartość wypłaty,
//średnią wartość wpłaty.