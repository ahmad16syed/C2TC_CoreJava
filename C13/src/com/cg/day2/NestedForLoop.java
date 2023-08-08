package com.cg.day2;

public class NestedForLoop {

	public static void main(String[] args) {
		//A nested for loop to print 1-5 triangle
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	
}
