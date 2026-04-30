package com.rays.Collection.equalhashcode;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "abc", 100);
		Employee e2 = new Employee(1, "abc", 100);
		Employee e3 = new Employee(3, "aaa", 100);
		Employee e4 = new Employee(4, "bbb", 100);
		Employee e5 = new Employee(5, "ccc", 100);

		Map m = new HashMap();

		m.put(e2, "one");
		m.put(e3, "two");

		System.out.println("Map : " + m);
		
		m.containsKey(e2);
		}

}
