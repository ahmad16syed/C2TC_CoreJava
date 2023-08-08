package com.cg.day10.Array;

public class SingleDimMultiplication {

	int multiplyArrays(int a1[], int a2[])[] {
        if (a1.length != a2.length) {
            throw new IllegalArgumentException("Arrays must have the same length.");
        }
        
        int result[] = new int[a1.length];
        for (int i = 0; i < a1.length; i++) {
            result[i] = a1[i] * a2[i];
        }

        return result;
    }
	
}
