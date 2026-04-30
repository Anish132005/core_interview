package com.rays.Collection.map;

import java.util.HashMap;

public class MapInterface {

	public static void main(String[] args) {

		HashMap m = new HashMap();

		m.put(1, "Anish");
		m.put(2, "Malviya");
		m.put(3, "Kanak");
		m.put(4, "ankush");

		System.out.println(m.entrySet());
		System.out.println(m.get(3));
		System.out.println(m.containsKey(3));
		System.out.println(m.keySet());
		System.out.println(m.values());
	}
}