package com.rays.Collection.list;

import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add("ram");
		list.add(60);
		list.add(70);

		System.out.println(list.add(100));
		System.out.println(list);
		System.out.println(list.set(2, 500));
		System.out.println(list);
		System.out.println(list.remove(5));
		System.out.println(list);
		System.out.println(list.indexOf(500));
		System.out.println();
		
	}

}
