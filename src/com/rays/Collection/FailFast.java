package com.rays.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast {

	public static void main(String[] args) {

		List l = new ArrayList();

		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);

		Iterator it = l.iterator();

		l.add(111);
		l.remove(2);

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
