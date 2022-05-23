package com.fdmgroup.bankDesignProject;

public class SavingsAccount extends Account {
    private double interestRate;

    public void addInterest() {
        balance = balance * (1 + interestRate / 100);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double withdraw(int amount) {
        if (getBalance() < amount){
            return 0;
        }
        balance -= amount;
        return amount;
    }
}
