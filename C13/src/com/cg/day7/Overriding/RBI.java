package com.cg.day7.Overriding;

public class RBI {

	double taxPercent() {
		return 7.2;
	}
	
}

class SBI extends RBI {
	
	double taxPercent() {
		return 8.2;
	}
	
}

class ICICI extends SBI {
	
	double taxPercent() {
		return 9.2;
	}
	
}
