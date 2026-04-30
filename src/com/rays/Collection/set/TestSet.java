package com.rays.Collection.set;

import java.util.HashSet;

public class TestSet {

	public static void main(String[] args) {

		HashSet s = new HashSet();

		s.add(100);
		s.add(200);
		s.add(300);
		s.add(400);
		s.add(500);
		s.add(600);

		System.out.println(s.contains(300));
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		System.out.println(s.remove(400));
		s.clear();
		
		System.out.println(s);

	}

}
