package com.rays.exception;

public class NullPointer {

	public static void main(String[] args) {

		String a = null;
		int b = 10 / 0;

		try {
			System.out.println(a.length());

		} catch (NullPointerException e) {
			System.out.println(e);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		} finally {
			System.out.println("Anish Malviya");

		}

	}
}