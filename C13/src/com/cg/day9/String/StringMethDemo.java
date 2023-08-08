package com.cg.day9.String;

public class StringMethDemo {

	public static void main(String[] args) {

		StringMethods sm = new StringMethods();
		
		sm.length("Ahmad");
		sm.toLower("HI");
		sm.toUpper("hello");
		sm.concatinate("Good ", "Boy");
		sm.substring1("How are you", 5);
		sm.substring2("How are you", 2, 7);
	}

}
