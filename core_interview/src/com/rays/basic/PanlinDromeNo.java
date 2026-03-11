package com.rays.basic;

public class PanlinDromeNo {

	public static void main(String[] args) {

		int num = 125;
		int num2 = num;
		int temp = 0;
		int r = 0;

		while (num2 != 0) {

			r = num2 % 10;
			temp = temp * 10 + r;
			num2 = num2 / 10;

		}

		if (temp == num) {
			System.out.println("is PalinDrome");

		} else {
			System.out.println("Is Not Palindrome");
		}

	}
}