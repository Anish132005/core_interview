package com.rays.Collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {

	public static void main(String[] args) {

		List l = new ArrayList();

		l.add(10);
		l.add(20);
		l.add(30);
		l.add("lokesh");
		l.add("Anish");

		Iterator it = l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
