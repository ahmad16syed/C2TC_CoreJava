package com.cg.day11.ExceptionHandling;

public class SimpleException {

	int a[] = { 10, 20, 30, 40, 50};
	
	void print(int b) {
		
		try {
			System.out.println(a[b]);
		}catch(Exception e) {
			System.err.println(e);
		}
		
	}

	
}
