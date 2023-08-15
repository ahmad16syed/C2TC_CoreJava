package com.cg.day13.Synchronization;

public class AccountThread extends Thread{

	private Account acc;
	private int amount;
	public AccountThread(Account acc, int amount) {
		this.acc = acc;
		this.amount = amount;
		start();
	}
	
	public void run() {
		try{
			acc.withdraw(amount);
		} catch (InsufficientBalanceException e) {
			System.err.println(e.getMessage());
		}
	}
	
}
