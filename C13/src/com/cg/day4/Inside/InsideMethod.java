package com.cg.day4.Inside;

public class InsideMethod {

	// access specifiers
	int defVariable = 10;
	private int priVariable = 20;
	protected int proVariable = 30;
	public int pubVariable = 40;
	
	void defMethod() {
		System.out.println("Default Method");
		System.out.println(defVariable);
	}
	
	//private variables and functions can only be used in the same class only except in the use of getter and setter 
	private void priMethod() {
		System.out.println("Private Method");
		System.out.println(priVariable);
	}
	
	protected void proMethod() {
		System.out.println("Protected Method");
		System.out.println(proVariable);
	}
	
	public void pubMethod() {
		System.out.println("Public Method");
		System.out.println(pubVariable);
	}
	
}
