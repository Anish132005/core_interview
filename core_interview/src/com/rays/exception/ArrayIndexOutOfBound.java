package com.rays.exception;

public class ArrayIndexOutOfBound {

	public static void main(String[] args) {

		String a = "Anish";
		  

		try {
			System.out.println(a.charAt(6));
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Always Excute");
		}

	}

}
