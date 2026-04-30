package com.rays.oop.polymorphism.wc;

public class Circle extends Shape {

	public double radius;
	public static final double PI = 3.14;

	public Circle(double radius) {

		this.radius = radius;

	}

	@Override
	public double area() {

		double Carea = PI * radius * radius;

		System.out.println("Area of circle" + Carea);

		return Carea;

	}

}