package com.cg.day2;

public class NestedIfStmt {

	public static void main(String[] args) {
		// if inside another if
		int a = 1, b = 2;
		if(a < b) {
			System.out.println(a);
			if(b > a) {
				System.out.println(b);
			}
		}
		
	}

	
}
