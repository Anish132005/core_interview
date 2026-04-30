package com.rays.basic;

public class NoteCount {

	public static void main(String[] args) {

		int[] notes = { 500, 200, 100, 50, 20, 10 };

		int count = 0;
		int money = 4500;

		for (int i = 0; i < notes.length; i++) {

			count = money / notes[i];

			if (count > 0) {
				System.out.println(notes[i] + "=" + count);

			}

			money = money % notes[i];

		}
	}
}