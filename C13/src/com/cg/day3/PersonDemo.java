package com.cg.day3;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name = scan.nextLine();
		System.out.println("Enter Gender : ");
		String gender = scan.nextLine();
		System.out.println("Enter Age : ");
		int age  = scan.nextInt();
		System.out.println("Enter Income : ");
		int income = scan.nextInt();
		
		PersonClass person = new PersonClass();
		person.setName(name);
		person.setGender(gender);
		person.setAge(age);
		person.setIncome(income);
		
		System.out.println("Person : " + person);
		
		TaxCalculation tax = new TaxCalculation(); 
		tax.calculateTax(person);
		
		System.out.println("After Adding Tax");
		System.out.println("Person : " + person);
		
		scan.close();
		
	}

}
