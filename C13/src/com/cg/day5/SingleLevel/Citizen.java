package com.cg.day5.SingleLevel;

public class Citizen {

	private String name;
	private String aadhar;
	private long phNo;
	private String area;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadhar=" + aadhar + ", phNo=" + phNo + ", area=" + area + "]";
	}
	
}
