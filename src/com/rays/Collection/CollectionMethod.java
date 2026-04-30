package com.rays.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethod {

	public static void main(String[] args) {
		
		Collection<Integer> c = new ArrayList();
		
		c.add(100);
		c.add(200);
		c.add(300);
		c.add(400);
		c.add(500);
		
		System.out.println(c.add(600));
		System.out.println(c.contains(100));
		System.out.println(c.containsAll(c));
		System.out.println(c.size());
		System.out.println(c.remove(100));
		System.out.println(c.isEmpty());
		c.clear();
		System.out.println(c);
		
	}
}