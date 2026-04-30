package com.rays.basic;

public class Example {

	public void display() {

		System.out.println("object created using class.forName() and newInstance()");

	}
	

	public static void main(String[] args) {

		try {

			Class<?> clazz = Class.forName("com.rays.basic.Example");
			Example example = (Example) clazz.getDeclaredConstructor().newInstance();

			example.display();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
