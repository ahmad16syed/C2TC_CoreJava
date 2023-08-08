package com.cg.day8.Bank1;

public class SavingAccount extends Person implements Bank{

	private int accNo;
	private float balance;
	
	public SavingAccount(String name, String city, int accNo, float balance) {
		super(name, city);
		this.accNo = accNo;
		this.balance = balance;
	}
	
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public void deposit(float amount) {

		if (amount > MAX_DEPOSIT) {
			System.out.println("Daily Limit Exceedd....Cannot Deposit");
		}
		else {
			balance += amount;
			System.out.println("Amount Successfully Deposited..." + amount);
		}
		
	}
	
	@Override
	public void withdraw(float amount) {

		if (amount <= balance - MIN_BALANCE) {
			balance -= amount;
			System.out.println("Withdraw Successful..." + amount);
		}
		else {
			System.out.println("Insufficient Balance...Cannot Withdraw");
		}
		
	}

	@Override
	public String toString() {
		return "SavingAccount [Name = " + getName() +  ", City = "
				+ getCity()  + ", AccNo = " + accNo + ", Balance = " + balance + "]";
	}
	
}
