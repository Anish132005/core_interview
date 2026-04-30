package com.rays.exception;

public class Arthmetic {

	public static void main(String[] args) {

		String a = "Anish";
		int b = 10;

		try {
			System.out.println(a.length());
			System.out.println(b / 0);
		} catch (Exception e) {
			System.out.println(e);
           System.exit(0);
		}finally {
			System.out.println("anish");
		}
	}

}