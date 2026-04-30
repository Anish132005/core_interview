package com.rays.exception;

import java.util.ArrayList;
import java.util.Iterator;

public class NoSuchElement {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("Anish");
		list.add("Malviya");

		Iterator it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		try {
			System.out.println(it.next());
		} catch (Exception e) {

			System.out.println(e);

			e.printStackTrace();

		}

	}
}