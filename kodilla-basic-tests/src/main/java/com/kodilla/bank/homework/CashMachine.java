package com.kodilla.bank.homework;


class CashMachine {

    public static int[] transactionsIncome;
    public static int[] transactionsOutcome;


    public CashMachine() {

        this.transactionsIncome = new int[10];
        this.transactionsOutcome = new int[10];
    }
    public static void main(String[] args) {
    }


    public void addTransaction(int value){
        transactionsIncome[0]= value;
        
    }

    public void withdrawTransaction(int value) {
        transactionsOutcome[0] = value;
       
   }


    public int getCountAddTransaction() {
        int getCountAddTransaction = transactionsIncome.length;
        return getCountAddTransaction;
    }
    public int getCountWithdrawTransaction() {
        int getCountaddTransaction = transactionsOutcome.length;
        return getCountaddTransaction;
    }

    public int getCountTransactions() { // metoda na liczbę transakcji?
        int getCountTransactions = transactionsIncome.length + transactionsOutcome.length;

        return getCountTransactions();
    }

    public int getBalance() {
        int sumIn = 0;
        int sumOut = 0;

        for (int i = 0; i < transactionsIncome.length; i++)
            sumIn = sumIn + transactionsIncome[i];

        for (int i = 0; i < transactionsOutcome.length; i++)
            sumOut = sumOut + transactionsOutcome[i];
            return sumIn + sumOut;
    }

    public double getAverageAddTransaction() {
        double sumIn = 0;
        for (int i = 0; i < this.transactionsIncome.length; i++) {
            sumIn += this.transactionsIncome[i];
        }

        return sumIn/this.transactionsIncome.length;
    }








    public double getAverageWithdrawTransactions() {
            double sumOut = 0;
        for (int i = 0; i < this.transactionsOutcome.length; i++) {
            sumOut += this.transactionsOutcome[i];
        }

        return sumOut/this.transactionsOutcome.length;
    }



}
