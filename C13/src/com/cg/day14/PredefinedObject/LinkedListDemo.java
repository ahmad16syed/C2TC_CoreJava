package com.cg.day14.PredefinedObject;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(23);
		list.add(44);
		list.add(77);
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(56);
		list.add(77);
		list.add(88);
		list.add(77);
		
		System.out.println(list);
		
		list.removeFirstOccurrence(77);
		System.out.println(list);
		
		list.removeLastOccurrence(77);
		System.out.println(list);
		
	}

}
