package com.rays.exception;

public class Account {

	public double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void Withdrwal(double amt) {
		if (amt > this.balance) {

			throw new InsufficentFundException();

		} else {
			this.balance = this.balance - amt;
			System.out.println("Final Balance = " + this.balance);
		}
	}

	public void Deposite(double amt) {

		this.balance = this.balance + amt;
		System.out.println("After Deposite balance = " + this.balance);
	}
}
