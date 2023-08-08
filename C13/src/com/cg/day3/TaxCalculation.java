package com.cg.day3;

public class TaxCalculation {
	public void calculateTax(PersonClass aa) {
	
	if(aa.getAge() > 65 || aa.getGender().equalsIgnoreCase(null)) {
		aa.setTax(0);
		System.out.println("Not Eligible for Tax");
	}
	else {
		if (aa.getIncome() <= 800000) {
			aa.setTax(0);
		}
		else if (aa.getIncome() > 800000 && aa.getIncome() <= 2000000) {
			aa.setTax((aa.getIncome() - 800000) * 10 / 100);
		}
		else {
			aa.setTax((aa.getIncome() - 800000) * 25 / 100);
		}
	}
	}
}
