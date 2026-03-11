package com.rays.oop.polymorphism.mrt;

public class Shape {

	public double area() {
		return 0;
	}

	public static Shape getShape(int i) {

		if (i == 1) {
			return new Circle(10);
		}

		if (i == 2) {
			return new Rectangle(10, 5);
		}

		return new Shape();

	}
}
