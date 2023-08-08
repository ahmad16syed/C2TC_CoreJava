package com.cg.day10.Array;

public class MultiDimAddition {
	int addArrays(int a1[][], int a2[][])[][] {
        if (a1.length != a2.length || a1[0].length != a2[0].length) {
            throw new IllegalArgumentException("Arrays must have the same dimensions.");
        }

        int rows = a1.length;
        int columns = a1[0].length;
        int result[][] = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = a1[i][j] + a2[i][j];
            }
        }

        return result;
    }
}
