package com.rays.basic;

public class SecondHigh {

	public static void main(String[] args) {

		int[] num = {20, 55, 78 ,89 ,95};

		int temp = 0;
		int count = 0;

		for (int i = 0; i < num.length; i++) {

			if (temp < num[i]) {

				count = temp;
				temp = num[i];
			}

			if (count < num[i] && temp > num[i]) {

				count = num[i];

			}
		}

		System.out.println(count);

	}

}
