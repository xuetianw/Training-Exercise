package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import customexception.InsufficientFundException;

class AccountTest {

	private double balance = 1000;
	private double minimumBalance = 100;
	private Account account = null;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		account = new Account(1, balance, minimumBalance);
	}

	//Arrange
	//Act
	//Assert
	
	@Test
	void testAccountDepositMethodWhenAmoutIsPassedAsArgument() {
		//Arrange
		double amountToDeposit = 200.0;
		double expectedBalance = balance + amountToDeposit;
		
		//Act
		double actualBalance = account.deposit(amountToDeposit);
		
		//Assert
		assertEquals(expectedBalance, actualBalance);
	}

	@Test
	void testAccountWithdrawMethodWhenDoubleArgumentIsPassed() throws InsufficientFundException {
		//Arrange
		double amountToWithdraw = 200;
		double expectedBalance = balance - amountToWithdraw;
		
		//Act
		double actualBalance = account.withdraw(amountToWithdraw);
		
		//Assert
		assertEquals(expectedBalance, actualBalance);
	}
	
	@Test
	void testAccountWithdrawMethodWhenDoubleArgumentValueIsPassedGreaterThanBalance() throws InsufficientFundException {
		double amountToWithdraw = balance + 1;
		
		assertThrows(InsufficientFundException.class, () -> account.withdraw(amountToWithdraw));	
	}
}
