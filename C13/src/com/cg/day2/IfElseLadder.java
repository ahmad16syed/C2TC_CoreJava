package com.cg.day2;

public class IfElseLadder {

	public static void main(String[] args) {
		//if else ladder to find greatest number
		int i = 1, j = 2, k = 3;
		
		if (i > j && i > k) {
			System.out.println("I is the greatest");
		}
		else if (j > k){
			System.out.println("J is the greatest");
		}
		else {
			System.out.println("K is the greatest");
		}
	}

}
