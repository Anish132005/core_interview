package com.rays.oop.abstraction;

public class TestBussiness {

	public static void main(String[] args) {

		Richman r = new Bussinessman();

		r.earnMoney();
		r.donation();
		r.party();

		SocialWorker w = new Bussinessman();

		w.helpToOther();
	}
}