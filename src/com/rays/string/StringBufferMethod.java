package com.rays.string;

public class StringBufferMethod {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Anish");
		
		sb.append("Malviya");
		
		System.out.println(sb);
		
		System.out.println("length :" + sb.length()) ;
		
		System.out.println("Capicity :" + sb.capacity());
		
		System.out.println(sb.charAt(1));
		
		System.out.println(sb.indexOf("A"));		
		
		System.out.println(sb.replace(6,8 , "hello"));
		
		
		
		
	}

}