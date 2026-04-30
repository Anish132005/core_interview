package com.rays.Collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapIterator {

	public static void main(String[] args) {

		HashMap m = new HashMap();

		m.put(1, "a");
		m.put(2, "b");
		m.put(3, "c");

		for (Object o : m.keySet()) {
			System.out.println(o);

			
		}
		
		System.out.println("=============");
		
		for (Object o : m.values()) {
			System.out.println(o);

		}
		System.out.println("=============");
		
		
		
		for (Object o : m.entrySet()) {
			System.out.println(o);

		}

	}
}