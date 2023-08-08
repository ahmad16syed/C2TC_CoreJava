package com.cg.day5.HierarchyLevel;

public class HierarchyDemo {

	public static void main(String[] args) {

		Cse cse = new Cse();
		Ece ece = new Ece();
		Eee eee = new Eee();
		It it = new It();
		Mech mech = new Mech();
		
		cse.setCollegeName("MSAJCE");
		cse.setCollegeArea("Siruseri");
		cse.setCollegeCode(1301);
		cse.setHodName("asdfghjkl");
		cse.setNoOfStaff(10);
		cse.setNoOfStudents(30);
		
		ece.setCollegeName("MSAJCE");
		ece.setCollegeArea("Siruseri");
		ece.setCollegeCode(1301);
		ece.setHodName("asdfghjkl");
		ece.setNoOfStaff(10);
		ece.setNoOfStudents(30);
		
		eee.setCollegeName("MSAJCE");
		eee.setCollegeArea("Siruseri");
		eee.setCollegeCode(1301);
		eee.setHodName("asdfghjkl");
		eee.setNoOfStaff(10);
		eee.setNoOfStudents(30);
		
		it.setCollegeName("MSAJCE");
		it.setCollegeArea("Siruseri");
		it.setCollegeCode(1301);
		it.setHodName("asdfghjkl");
		it.setNoOfStaff(10);
		it.setNoOfStudents(30);
		
		mech.setCollegeName("MSAJCE");
		mech.setCollegeArea("Siruseri");
		mech.setCollegeCode(1301);
		mech.setHodName("asdfghjkl");
		mech.setNoOfStaff(10);
		mech.setNoOfStudents(30);
		
		System.out.println(cse);
		System.out.println("...............");
		System.out.println(ece);
		System.out.println("...............");
		System.out.println(eee);
		System.out.println("...............");
		System.out.println(it);
		System.out.println("...............");
		System.out.println(mech);
		
	}

}
