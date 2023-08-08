package com.cg.day11.ExceptionHandling;

public class UserDefinedExceptionDemo {

	public static void main(String[] args) {

		UserDefinedExceptionMethod obj = new UserDefinedExceptionMethod();
        try {
            obj.myMethod(-5);
        } catch (UserDefinedException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
		
	}

}
