package com.syntax.class10;

public class Recap {

	// There are 4 floors
	// Room numbers go frim 1.1,1.2 ...1.7
	public static void main(String[] args) {

		int rows = 4;
		int cols = 7;
		for (int i = 1; i <= rows; i++) {
			// we just moved to a new floor
			// System.out.print("WE are in floor"+ i+ "-->");
			// we are iterating the rooms
			for (int j = 1; j <= cols; j++) {
				System.out.print(i + "." + j + " ");
			}
			// The stairs ti the next floor
			System.out.println();
		}
	}
}
