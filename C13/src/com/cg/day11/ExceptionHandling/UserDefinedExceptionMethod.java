package com.cg.day11.ExceptionHandling;

public class UserDefinedExceptionMethod {

	public void myMethod(int value) throws UserDefinedException {
		
        if (value < 0) {
            throw new UserDefinedException("Invalid value: " + value);
        }
        
    }
	
}
