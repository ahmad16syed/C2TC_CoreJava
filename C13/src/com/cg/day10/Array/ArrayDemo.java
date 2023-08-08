package com.cg.day10.Array;

public class ArrayDemo {

	public static void main(String[] args) {

		int array1[] = {1, 2, 3, 4, 5};
		int array2[] = {2, 4, 6, 8, 10};
		
		SingleDimMultiplication sdm = new SingleDimMultiplication();
		MultiDimAddition mda = new MultiDimAddition();
		
		int out1[] = sdm.multiplyArrays(array1, array2);
		
		System.out.println("Multiplied Array :");
		for(int i = 0; i < out1.length; i++) {
			System.out.print(out1[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		int a[][] = {
				{1, 2}, 
				{3, 4}, 
				{5, 6}};
		
		int b[][] = {
				{3, 6}, 
				{2, 4}, 
				{4, 8}};
		
		int out2[][] = mda.addArrays(a, b);
		
		System.out.println("Added Array :");
		for (int i = 0; i < out2.length; i++) {
            for (int j = 0; j < out2[i].length; j++) {
                System.out.print(out2[i][j] + " ");
            }
            System.out.println();
        }
		
	}

}
