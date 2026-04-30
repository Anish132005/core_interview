package com.rays.Collection.list;

import java.util.ArrayList;
import java.util.List;

//1. List can contain duplicate elements
//2. List can contain multiple null values
//3. Order of list is natural order
public class TestArrayList {

	public static void main(String[] args) {

		List l = new ArrayList();

		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");
		l.add("f");
		l.add("f");

		System.out.println(l.get(4));
		System.out.println(l.set(2, "k"));
		System.out.println(l);
		System.out.println(l.indexOf("a"));
		System.out.println(l.lastIndexOf("f"));
		System.out.println(l.subList(1, 5));
		l.clear();
		System.out.println(l);

	}
}