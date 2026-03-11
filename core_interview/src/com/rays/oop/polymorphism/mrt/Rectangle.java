package com.rays.oop.polymorphism.mrt;

public class Rectangle extends Shape {

	public double length;
	public double width;

	public Rectangle(double length, double width) {

		this.length = length;
		this.width = width;
	}

	@Override
	public double area() {
		double Rarea = length * width;
		System.out.println("Area of rectagle" + Rarea);
		return Rarea;

	}

}
