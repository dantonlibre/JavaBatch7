package com.syntax.class10;

public class TreanglePattern {

	public static void main(String[] args) {
		// Let us print the following triangle
		// *
		// **
		// ***
		// ****
		// *****

		for (int r = 1; r <= 5; r++) {

			for (int c = 1; c <= r; c++) {
				System.out.print("*");
			}

			System.out.println();
		}

		// Let us add the second triangle
		// ****
		// ***
		// **
		// *

		for (int r = 4; r >= 1; r--) {

			for (int c = 1; c <= r; c++) {
				System.out.print("*");
			}

			System.out.println();
		}
		for(int i = 1; i<=5;i++) {
			for(int c =1; c<=i; c++) {
				System.out.print("*");
		}
			System.out.println();

	}
         for(int k = 9;k>=5; k--) {
        	 for(int l = 5; l <=k;l++) {
        		 System.out.print("*");
        	 }
        	 System.out.println();
         }
	}}
