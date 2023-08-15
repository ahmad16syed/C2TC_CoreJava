package com.cg.day13.Synchronization;

public interface Bank {
	
	static final int MINBAL = 5000;
	static final int DAILY_LIMIT = 25000;
	void deposit(int amt) throws DepositLimitExceedExpectation;
	void withdraw(int amt) throws InsufficientBalanceException;

}
