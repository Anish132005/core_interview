package com.rays.oop.abstraction;

public class Rectangle extends shape {

	private int lenght;
	private int width;

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getWidht() {
		return width;
	}

	public void setWidth(int widht) {
		this.width = widht;
	}

	@Override
	public double area() {
		return super.area();
	}

}
