package com.rays.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendar30 {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		Calendar c = Calendar.getInstance();

		Date date = sdf.parse("01-12-2025");

		c.setTime(date);

		for (int i = 1; i <= 12; i++) {

			System.out.println(sdf.format(c.getTime()));

			c.add(Calendar.DATE, 30);
		}

	}

}