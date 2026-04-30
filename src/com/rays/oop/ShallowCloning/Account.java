package com.rays.oop.ShallowCloning;

public class Account implements Cloneable {

	public int balance;

	@Override
	public Object clone() throws CloneNotSupportedException {

		return super.clone();

	}

}
