package com.cg.day9.String;

public class StringMethods {
	
	void length(String a) {
		System.out.println(a.length());
	}
	
	void toLower(String a) {
		System.out.println(a.toLowerCase());
	}
	
	void toUpper(String a) {
		System.out.println(a.toUpperCase());
	}
	
	void concatinate(String a, String b) {
		System.out.println(a.concat(b));
	}
	
	void substring1(String a, int b) {
		System.out.println(a.substring(b));
	}
	
	void substring2(String a, int b, int c) {
		System.out.println(a.substring(b, c));
	}
	
}
