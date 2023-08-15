package com.cg.day14.UserdefinedObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		List<Student> li = new ArrayList<Student>();
		Student s = new Student(21, "Ahmad",63.3f);
		li.add(s);
		
		s = new Student(23, "Syed",63.3f);
		li.add(s);
		
		s = new Student(24, "Raashid",73.6f);
		li.add(s);
		
		s = new Student(25, "Basith",79.7f);
		li.add(s);
		
		s = new Student(20, "Sarah",83.8f);
		li.add(s);
		
		System.out.println("Before Sorting.....");
		ListIterator<Student> i = li.listIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("After Sorting.....");
		Collections.sort(li);
		ListIterator<Student> i2 = li.listIterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		
	}

}
