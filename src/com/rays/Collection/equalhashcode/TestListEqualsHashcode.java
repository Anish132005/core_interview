package com.rays.Collection.equalhashcode;

import java.util.ArrayList;
import java.util.List;

public class TestListEqualsHashcode {
	public static void main(String[] args) {

		Employee e1 = new Employee(1, "abc", 100);
		Employee e2 = new Employee(2, "xyz", 100);
		Employee e3 = new Employee(3, "aaa", 100);

		List l = new ArrayList();
		
		l.add(e1);
		l.add(e2);
		l.add(e3);
		

		Employee emp = new Employee(3, "aaa", 100);


		System.out.println("list: " + l.remove(emp));

		System.out.println("list: " + l);

	}
}