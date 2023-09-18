//Program to demonstrate Lambda expression without parameters
package com.cg.day19;

public class LambdaWithoutParameter {

	public static void main(String[] args) {
		
		Statement s = () -> {return "Hello World!!";};
		System.out.println(s.show());


	}

}