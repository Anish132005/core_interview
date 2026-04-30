package com.rays.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) throws ParseException {

		String dob = "8-02-2005";

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		Date sdob = sdf.parse(dob);

		System.out.println(sdob);

	}
}
