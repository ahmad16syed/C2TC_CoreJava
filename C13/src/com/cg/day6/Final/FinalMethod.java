package com.cg.day6.Final;

public final class FinalMethod {

	final int a;
	
	final static int b;
	
	//Constructor
	FinalMethod() {
		System.out.println("Constructor Block");
		a = 10;
		// b = 5; b cannot be reassigned as it was already assigned in the static block
	}
	
	static {
		System.out.println("Static Block");
		b = 20;
		// a = 12; non static variable cannot be accessed in a static block 
	}

	@Override
	public String toString() {
		return "FinalMethod [a = " + a + ", b = " + b + "]";
	}
	
	
}
