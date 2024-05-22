package org.crwong.day04.control.loop.exercise;

public class Exercise_ForDouble1 {
	public static void main(String[] args) {
		// *
		// **
		// ***
		// ****
		// *****
		// ******
		int count = 1;
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < count; j++) {
				System.out.print("*");
			}
			System.out.println();
			count++;
		}
	}
}
