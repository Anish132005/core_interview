package com.rays.oop.polymorphism.mrt;

public class TestShape {

	public static void main(String[] args) {

		Shape[] s = new Shape[2];

		s[0] = Shape.getShape(1);
		s[1] = Shape.getShape(2);

		s[0] = new Circle(10);
		s[1] = new Rectangle(10, 5);

		for (int i = 0; i < s.length; i++) {
			s[i].area();
		}

	}

}
