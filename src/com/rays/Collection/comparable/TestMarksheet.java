package com.rays.Collection.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class TestMarksheet {

	public static void main(String[] args) {

		ArrayList<Marksheet> list = new ArrayList<Marksheet>();

		list.add(new Marksheet("105", "Anish", 23));
		list.add(new Marksheet("101", "Anish", 66));
		list.add(new Marksheet("103", "kanak", 62));
		list.add(new Marksheet("102", "mahi", 80));
		

		list.forEach(System.out::println);
		
		System.out.println("------sorted marksheet------");
		
		Collections.sort(list); // use comparable interface
		
		list.forEach(System.out::println);

	}

}