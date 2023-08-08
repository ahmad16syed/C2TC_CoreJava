package com.cg.day8.Bank1;

public class BankDemo {

	public static void main(String[] args) {

		SavingAccount sa = new SavingAccount("Ahmad", "Chennai", 6004, 65000);
		System.out.println(sa);
		
		sa.deposit(12000);
		System.out.println(sa);
		
		sa.withdraw(5000);
		System.out.println(sa);
		
		sa.withdraw(70000);
		System.out.println(sa);
		
		sa.deposit(120000);
		System.out.println(sa);
		
	}

}
