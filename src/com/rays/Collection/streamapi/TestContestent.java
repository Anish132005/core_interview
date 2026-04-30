package com.rays.Collection.streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestent {

	public static void main(String[] args) {

		List<Contestent> l = new ArrayList<>();

		l.add(new Contestent("Anish", "9589154405"));
		l.add(new Contestent("Abhishek", "7845154225"));
		l.add(new Contestent("Ankush", "9589154405"));
		l.add(new Contestent("kanak", "9589154405"));
		l.add(new Contestent("sandeep", "8855221144"));

		l.stream().filter(e -> e.phoneNo.length() == 10)
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(3).forEach(e -> {
					System.out.println(e.name + " " + e.phoneNo);
				});
	}
}