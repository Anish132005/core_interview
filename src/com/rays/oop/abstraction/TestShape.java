package com.rays.oop.abstraction;

public class TestShape {

	public static void main(String[] args) {

		shape s = new Rectangle();

		Rectangle r = (Rectangle) s;
		r.setLenght(2);
		r.setWidth(2);

		System.out.println("rectangle : " + r.getLenght());
		System.out.println("Rectangle : " + r.getWidht());
		System.out.println("Area : " + s.area());

	}

}
