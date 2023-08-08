package com.cg.day7.Overriding;

public class OverridingDemo {

	public static void main(String[] args) {

		ICICI icici = new ICICI();
		
		System.out.println(icici.taxPercent());
		
		SBI sbi = new SBI();
		
		System.out.println(sbi.taxPercent());
		
		RBI rbi = new RBI();
		
		System.out.println(rbi.taxPercent());
		
	}

}
