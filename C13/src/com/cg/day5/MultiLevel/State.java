package com.cg.day5.MultiLevel;

public class State extends Country {

	private String stateName;
	private String capitalCity;
	
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getCapitalCity() {
		return capitalCity;
	}
	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}
	
	@Override
	public String toString() {
		return "State Details [stateName = " + stateName + ", capitalCity = " + capitalCity + ", CountryName = "
				+ getCountryName() + ", CountryPopulation = " + getCountryPopulation() + "]";
	}
	
}
