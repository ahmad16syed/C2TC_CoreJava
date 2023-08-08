package com.cg.day2;

public class OperatorClass {

	public static void main(String[] args) {
		//Operators in Java 
		
		int a = 55, b = 37, c = 15;
		float d;
		
		//Arithmetic Operators(+,-,*,/,%)
		
		d = a + b;
		System.out.println("Added Value : " + d);
		
		d = a - b;
		System.out.println("Subtracted Value : " + d);
		
		d = a * b;
		System.out.println("Multiplied Value : " + d);
		
		d = a / b;
		System.out.println("Divided Value : " + d);
		
		d = a % b;
		System.out.println("Modulus Value : " + d);
		
		System.out.println();
		

		//Logical Operator(&&, ||, !)
		//Relational Operator(<,<=,>,>=,==,!=)
		
		if (a == b && b == c && a == c) {
			System.out.println("All Values are Equal.");
		}
		else if (a == b || b == c || a == c) {
			System.out.println("Two of the Values are Equal.");
		}
		else if(a > b  &&  a > c) {
			System.out.println("A is the Greatest Number.");
		}
		else if (b > c) {
			System.out.println("B is the Greatest Number.");
		}
		else {
			System.out.println("C is the Grestest Number.");
		}

		System.out.println();
		
		// Increment & Decrement
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
