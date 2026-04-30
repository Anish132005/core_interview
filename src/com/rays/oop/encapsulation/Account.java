package com.rays.oop.encapsulation;

public class Account {

	public double balance;
	public String accountType;
	public String number;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void deposite(double amt) {
		balance = balance + amt;

		System.out.println("total amt after " + balance);
	}

	public void withdrwal(double amt) {

		if (amt > balance) {
			System.err.println("inddj");
		} else {
			balance = balance - amt;

			System.out.println("rtyghuj" + balance);
		}
	}

}