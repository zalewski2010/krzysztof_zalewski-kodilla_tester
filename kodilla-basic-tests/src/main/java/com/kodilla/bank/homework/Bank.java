package com.kodilla.bank.homework;


public class Bank {
    public static void main(String[] args) {
        CashMachine machine0 = new CashMachine();
        machine0.addTransaction(100 + 100 + 200 + 250 + 300 + 200 + 300 + 250 + 350 + 400);
        machine0.withdrawTransaction(-50 - 100 - 50 - 100 - 75 - 100 - 120 - 130 - 150 - 200);
        int balance = machine0.getBalance();
        System.out.println("bilans w bankomacie = " + balance + " USD");

        int countWithdrawTransaction = machine0.getCountWithdrawTransaction();
        System.out.println("libcza wypłat w bankomacie : " + countWithdrawTransaction + " transakcji");

        int countAddTransaction = machine0.getCountAddTransaction();
        System.out.println("libcza wpłat w bankomacie : " + countAddTransaction + " transakcji");

        double averageAddTransaction = machine0.getAverageAddTransaction();
        System.out.println("Średnia wpłata w bankomacie : " + averageAddTransaction + " USD");

        double averageWithdraw = machine0.getAverageWithdrawTransactions();
        System.out.println("Średniawypłata w bankomacie : " + averageWithdraw + " USD");

        CashMachine machine1 = new CashMachine();
        machine1.addTransaction(50 + 50 + 100 + 125 + 150);
        machine1.withdrawTransaction(-25 - 50 - 25 - 50 - 37);
        int balance1 = machine1.getBalance();
        System.out.println("bilans w bankomacie1 = " + balance1 + " USD");


        int sumBalance = balance+balance1;
        System.out.println("bilans we wszystkich bankomatach banku: " + sumBalance + " usd");


    }
}
