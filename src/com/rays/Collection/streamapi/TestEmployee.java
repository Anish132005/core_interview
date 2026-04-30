package com.rays.Collection.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestEmployee {

	public static void main(String[] args) {

		List<Employee> l = new ArrayList<>();

		l.add(new Employee("Anish", 5000));
		l.add(new Employee("Abhishek", 6000));
		l.add(new Employee("kanak", 15000));
		l.add(new Employee("kanak", 10000));
		l.add(new Employee("Ram", 1000));


		
		  List<Employee> highpaidSalary = l.stream().filter(e -> e.getSalary() > 2000)
		  .collect(Collectors.toCollection(ArrayList::new));
		  
		  highpaidSalary.forEach(e -> System.out.println(e.getName() + " " +
		  e.getSalary()));

	}

}
