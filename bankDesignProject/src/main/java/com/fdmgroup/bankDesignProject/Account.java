package com.fdmgroup.bankDesignProject;

public abstract class Account {
    private final long ACCOUNT_ID;
    private static long nextAccountId = 1000;
    protected double balance;


    public Account() {
        balance = 0;
        ACCOUNT_ID = nextAccountId;
        nextAccountId += 5;
    }

    //It should return the value of the argument
    public double withdraw(int amount) {
        balance -= amount;
        return amount;
    }

    public void deposit(double amount){
        balance += amount;
    }


    public void correctBalance(double amount) {
        balance = amount;
    }

    public long getACCOUNT_ID() {
        return ACCOUNT_ID;
    }

    public double getBalance() {
        return balance;
    }

}
