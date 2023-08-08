package com.cg.day4.Outside;

import com.cg.day4.Inside.InsideMethod;

public class OutsideClass {

	public static void main(String[] args) {
		
		InsideMethod im = new InsideMethod();
		
		// only the public variables and functions can be accessed and editted in a class located in a different package from the InsideMethod() class
		
		System.out.println("Before Changing...");
		im.pubMethod();
		
		im.pubVariable = 49;
		
		System.out.println("After Changing...");
		im.pubMethod();
		
	}

}
