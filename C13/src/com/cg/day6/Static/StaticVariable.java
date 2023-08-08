package com.cg.day6.Static;

public class StaticVariable {

	private String name;
	private int rollNo;
	
	static String collegeName = "MSAJCE";
	
	StaticVariable(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "StaticVariable [name = " + name + ", rollNo = " + rollNo + ", College Name = " + collegeName +" ]";
	}
	
}
