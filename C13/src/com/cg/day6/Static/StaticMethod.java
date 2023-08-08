package com.cg.day6.Static;

public class StaticMethod {

	private int no;
	private static int reg;
	
	//Constructor
	StaticMethod() {
		System.out.println("Default Constructor");
		no++;
		reg++;
	}
	
	//Static Block - it will execute first even though it is placed in the middle
	static {
		System.out.println("Static block");
		reg = 5397;
	}

	@Override
	public String toString() {
		return "StaticMethod [no=" + no + ", reg = " + reg + " ]";
	}
	
	static void display() {
		System.out.println("reg = " + reg );
		//System.out.println("no = " + no); cannot be accessed inside static method
	}
	
}
