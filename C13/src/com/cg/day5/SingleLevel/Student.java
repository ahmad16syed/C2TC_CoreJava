package com.cg.day5.SingleLevel;

public class Student extends Citizen {

	private String college;
	private long rollNo;
	
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public long getRollNo() {
		return rollNo;
	}
	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}
	
	@Override
	public String toString() {
		return "Student Details [Name = " + getName()  + ", rollNo = " + rollNo + ", college = " + college + ", Aadhar = "
				+ getAadhar() + ", Phone No = " + getPhNo() + ", Area = " + getArea() + "]";
	}
	
}
