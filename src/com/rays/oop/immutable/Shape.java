package com.rays.oop.immutable;

public final class Shape {

	private final String name;

	public Shape(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {

		Shape s = new Shape("anish");

		System.out.println(s.name);

	}

}