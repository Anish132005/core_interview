package com.rays.Collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {
	
	public static void main(String [] args) {
		
		Vector<Integer> v = new Vector<>();
		
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(60);
		
     	Enumeration e = v.elements();  
     	v.add(2000);
     	v.remove(2);
     	
     	while(e.hasMoreElements()) {
     		System.out.println(e.nextElement());
     		
     	}
		
		
	}
}