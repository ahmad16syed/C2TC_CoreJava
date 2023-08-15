package com.cg.day13.Synchronization;

public class DepositLimitExceedExpectation extends Exception{

	public DepositLimitExceedExpectation() {
		super("Daily Limit Exceedss");
	}

	public DepositLimitExceedExpectation(String message) {
		super(message);
	}

}
