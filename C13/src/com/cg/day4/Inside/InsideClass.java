package com.cg.day4.Inside;

public class InsideClass {

	public static void main(String[] args) {
		
		InsideMethod im = new InsideMethod();
		
		// the default, protected and public variables and functions can be accessed and editted in the same package from a different class 
		
		System.out.println("Before Changing...");
		im.defMethod();
		im.proMethod();
		im.pubMethod();
		
		im.defVariable = 14;
		im.proVariable = 34;
		im.pubVariable = 44;
		
		System.out.println("After Changing...");
		im.defMethod();
		im.proMethod();
		im.pubMethod();
		
	}

}
