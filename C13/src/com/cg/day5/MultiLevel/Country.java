package com.cg.day5.MultiLevel;

public class Country {

	private String countryName;
	private long countryPopulation;
	
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public long getCountryPopulation() {
		return countryPopulation;
	}
	public void setCountryPopulation(long countryPopulation) {
		this.countryPopulation = countryPopulation;
	}
	
	@Override
	public String toString() {
		return "Country Details [countryName = " + countryName + ", countryPopulation = " + countryPopulation + "]";
	}

}
