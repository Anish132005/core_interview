package com.rays.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestLoginException {

	public static void main(String[] args) {

		try {

			FileReader file = new FileReader("Anish.txt");
			int data;

			while ((data = file.read()) != -1) {
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {

			System.out.print(e);
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}