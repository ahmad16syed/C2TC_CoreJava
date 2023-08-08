package com.cg.day3;

public class PersonClass {
	
	//Initiating private variables
	private String name;
	private int age;
	private String gender;
	private int income;
	private int tax;
	
	// Private variable getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	
	// toString format
	@Override
	public String toString() {
		return "PersonClass [name=" + name + ", age=" + age + ", gender=" + gender + ", income=" + income + ", tax="
				+ tax + "]";
	}
	
}
