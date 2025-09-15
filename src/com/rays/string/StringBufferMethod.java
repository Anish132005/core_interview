package com.rays.string;

public class StringBufferMethod {

	public static void main(String []args) {
		
		StringBuffer sb =  new StringBuffer("Anish");
		
		sb.append("Malviya");
		
		System.out.println(sb);
		
		
		System.out.println("Length : " + sb.length());
		
		System.out.println("Capicity : " + sb.capacity());
		
		System.out.println("");
		
	}

}
