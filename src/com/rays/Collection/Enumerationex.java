package com.rays.Collection;

import java.util.Enumeration;
import java.util.Vector;

public class Enumerationex {
	
	public static void main(String [] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		
		
		Enumeration<Integer> e  = v.elements();
		
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	}

}
