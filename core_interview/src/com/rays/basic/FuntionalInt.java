package com.rays.basic;

@FunctionalInterface
public interface FuntionalInt {

	public int sum(int a, int b);

	public static void multi(int a, int b) {

		System.out.println("multi" + a * b);
	}

	public default void sub(int a, int b) {
		System.out.println("sub" + (a - b));
	}
}