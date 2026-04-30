package com.rays.oop.abstraction;

public class Bussinessman implements Richman, SocialWorker {

	@Override
	public void earnMoney() {
		System.out.println("Earn Money");

	}

	@Override
	public void donation() {
		System.out.println("Donation");
	}

	@Override
	public void party() {
		System.out.println("Party");
	}

	@Override
	public void helpToOther() {
		System.out.println("Help to Other");
	}
}