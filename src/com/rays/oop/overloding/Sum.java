package com.rays.oop.overloding;

public class Sum {

	public int sum(int a, int b) {
		return a + b;
	}

	public int sum(int a, int b, int c) {
		return a + b + c;
	}

	public double sum(int k, int j, int l, int h) {
		return k + j + l + h;
	}

	public static void main(String[] args) {

		Sum s = new Sum();

		System.out.println(s.sum(4, 4));
		System.out.println(s.sum(7, 8, 9));
		System.out.println(s.sum(7, 8, 2, 4));
	}

}
