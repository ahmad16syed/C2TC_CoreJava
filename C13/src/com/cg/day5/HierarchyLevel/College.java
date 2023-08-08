package com.cg.day5.HierarchyLevel;

public class College {

	private String collegeName;
	private String collegeArea;
	private int collegeCode;
	
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCollegeArea() {
		return collegeArea;
	}
	public void setCollegeArea(String collegeArea) {
		this.collegeArea = collegeArea;
	}
	public int getCollegeCode() {
		return collegeCode;
	}
	public void setCollegeCode(int collegeCode) {
		this.collegeCode = collegeCode;
	}
	
	@Override
	public String toString() {
		return "College Details [collegeName=" + collegeName + ", collegeArea=" + collegeArea + ", collegeCode=" + collegeCode
				+ "]";
	}
	
}
