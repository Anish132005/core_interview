package com.rays.oop.encapsulation;

public class TestAccount {
	
	public static void main(String [] args) {
		
		Account a = new Account();
		
		a.setAccountType("Current");
		a.setNumber("9589");
		a.setBalance(12000);
		
		System.out.println("AccountType : " + a.getAccountType());
		System.out.println("Number : " + a.getNumber());
		System.out.println("Balance : " + a.getBalance());
		
		a.deposite(2000);
		a.withdrwal(500);
		a.withdrwal(4500);
	}
}