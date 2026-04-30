package com.rays.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class RetainAll {

	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add("Anish");
		c.add("a");
		c.add("d");
		c.add("e");
		c.add("f");
		c.add("g");
		
		Collection c1 = new ArrayList();
		
		c1.add("a");
		c1.add("b");
		c1.add("f");
		c1.add("f");
		
		c.retainAll(c1);
		
		System.out.println(c);
	

	}
}