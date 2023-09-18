//Program to demonstrate generic interface
package com.cg.day15.Generics;

//Generic Interface
public interface MinMax<T extends Comparable<T>> {

	T min();

	T max();
}

