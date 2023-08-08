package com.cg.day8.Interface;

public class ChildClass implements Interface2{

	@Override
	public void print() {

		System.out.println("Print Method from Interface1");
		
	}

	@Override
	public void show() {
		
		System.out.println("Show Method from Interface2");
		
	}

}
