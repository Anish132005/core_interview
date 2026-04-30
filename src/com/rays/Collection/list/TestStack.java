package com.rays.Collection.list;

import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {

		Stack s1 = new Stack();

		for (char c = 'a'; c <= 'z'; c++) {
			s1.push(c);
		}

		System.out.println("stack" + s1);
		System.out.println(s1.peek());
		System.out.println(s1.pop());

	}
}