package com.rays.Collection.comparable;

public class Marksheet implements Comparable<Marksheet> {

	private String name;
	private String rollNo;
	private int phy;

	public Marksheet(String name, String rollNo, int phy) {
		
		this.name = name;
		this.rollNo = rollNo;
		this.phy = phy;

	}

	@Override
	public int compareTo(Marksheet o) {

		if (this.name.equals(o.name)) {
			return this.rollNo.compareTo(o.rollNo);

		} else if (this.phy == o.phy) {
			return this.rollNo.compareTo(o.rollNo);
		} else {
			return this.phy - o.phy;
		}
	}

	@Override
	public String toString() {
		return "rollNo: " + rollNo + " name: " + name + " phy: " + phy;

	}
}
