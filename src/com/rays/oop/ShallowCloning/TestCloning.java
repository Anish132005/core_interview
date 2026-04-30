package com.rays.oop.ShallowCloning;

public class TestCloning {

	public static void main(String[] args) throws CloneNotSupportedException {

		Account a1 = new Account();

		a1.balance = 100;

		Account a2 = (Account) a1.clone();

		a2.balance = 300;

		System.out.println("Orignal : " + a1.balance);
		System.out.println("Copy : " + a2.balance);

	}
}