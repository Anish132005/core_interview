package com.rays.basic;

public class TestFunctional {

	public static void main(String[] args) {

		FuntionalInt f = new FuntionalInt() {

			@Override
			public int sum(int a, int b) {
				return a + b;
			}
		};

		int a = 10;
		int b = 20;
		System.out.println(f.sum(a, b));

		f.sub(a, b);

		FuntionalInt.multi(a, b);
	}

}