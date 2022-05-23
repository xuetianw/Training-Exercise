package main;

import customexception.InsufficientFundException;

public class Account {
	private int accountID;
	private double balance;
	private double minimumBalance;
	
	public Account(int accountID, double balance, double minimumBalance) {
		super();
		this.accountID = accountID;
		this.balance = balance;
		this.minimumBalance = minimumBalance;
	}

	public double deposit(double amountToDeposit) {
		
		return balance + amountToDeposit;
	}

	public double withdraw(double amountToWithdraw) throws InsufficientFundException {
		if(balance > amountToWithdraw) {
			return balance - amountToWithdraw;
		} else {
			throw new InsufficientFundException("Insufficient FUnds in the account");
		}
	}
	
}
