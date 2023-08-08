package com.cg.day8.NestedInterface;

public class ChildClass implements NestedInterface.InnerInterface{

//	For the below program to work the class should be 
//	ChildClass implements NestedInterface 
	
//	@Override
//	public void print() {
//
//		System.out.println("Print Method from OuterInterface");
//		
//	}

	@Override
	public void show() {
		
		System.out.println("Show Method from InnerInterface");
		
	}
	
}
