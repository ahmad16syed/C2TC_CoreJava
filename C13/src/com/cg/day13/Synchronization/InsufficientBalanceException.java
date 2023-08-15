package com.cg.day13.Synchronization;

public class InsufficientBalanceException extends Exception{

	public InsufficientBalanceException() {
		super("Insufficient Balance");
	}

	public InsufficientBalanceException(String message) {
		super(message);
	}

}
