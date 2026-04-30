package com.rays.exception;

public class UnchekedException {

	public static void main(String[] args) {
		dad();
	}

	public static void dad() {
		try {
			mom();
		} catch (RuntimeException e) {
			System.out.println("Unchecked : " + e.getMessage());
		}
	}

	public static void mom() {
		son();
	}

	public static void son() {
		throw new RuntimeException("Make a Mistake");
	}
}