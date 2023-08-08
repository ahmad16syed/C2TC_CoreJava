package com.cg.day8.NestedInterface;

public class NestedInterfaceDemo {

	public static void main(String[] args) {

		ChildClass cc = new ChildClass();
		
		cc.show();
		//cc.print(); 
		//This wont work since only the InnerInterface is called in the ChildClass
		
	}

}
