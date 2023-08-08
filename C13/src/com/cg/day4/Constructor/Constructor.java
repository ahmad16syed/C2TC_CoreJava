package com.cg.day4.Constructor;

public class Constructor {

	void print() {
		System.out.println("Print Function");
	}
	
	int add() {
		System.out.println("int function. return statement is a must");
		return 0;
	}
	
	public Constructor() {
		System.out.println("Normal Constructor");
	}
	
	public Constructor(int a) {
		System.out.println("int containing constructor");
		System.out.println(a);
	}
	
}
