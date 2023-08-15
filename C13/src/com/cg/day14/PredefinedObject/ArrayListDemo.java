package com.cg.day14.PredefinedObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List list1 = new ArrayList();
		System.out.println("Size : " + list1.size());
		System.out.println("Is my list Empty ? " + list1.isEmpty());
		
		list1.add(21);
		list1.add('A');
		list1.add(true);
		list1.add("Hi Hello");
		list1.add(24.5);
		list1.add(25);
		
		System.out.println(list1);
		System.out.println(list1.contains(21));
		
		list1.remove(4);
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(23);
//		list2.add(true);
//		list2.add('A');
//		list2.add(24.6);
		
		List<String> list3 = new ArrayList<String>();
		list3.add("Ahmad");
		list3.add("Syed");
		list3.add("Semar");
		list3.add("Sarah");
		list3.add("Basith");
		list3.add("Zeenath");
		list3.add("Buhari");
		
		System.out.println("Array List : " + list3);
		
		Collections.reverse(list3);
		System.out.println("Reversed List : " + list3);
		
		Collections.sort(list3);
		System.out.println("Ascending Order : " + list3);
		
		Collections.reverse(list3);
		System.out.println("Descending Order : " + list3);
		
	}

}
