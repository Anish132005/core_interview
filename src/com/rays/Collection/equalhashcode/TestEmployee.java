package com.rays.Collection.equalhashcode;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee emp = new Employee(10, "Anish", 150000);
		Employee emp1 = new Employee(10,"Anish" , 150000);
		
		
		System.out.println("Employee e1: " + emp);

		System.out.println("Employee e2: " + emp1);
		
		System.out.println(emp.equals(emp1));
		
		
		
		
		
		
	}
}