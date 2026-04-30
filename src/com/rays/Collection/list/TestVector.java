package com.rays.Collection.list;

import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {

		Vector v = new Vector();
		
		v.addElement(10);
		v.addElement("Anish");
		v.addElement(2.3);
		v.addElement(45);
		v.addElement(45);
		
		System.out.println(v.elementAt(4));
		

	}

}
