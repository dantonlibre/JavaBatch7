package com.syntax.class15;

import java.util.Scanner;

public class HW3 {
	//Create a String and print it in reverse order(Sunday->yadnus)

public static void main(String[] args) {

	
	Scanner scan = new Scanner(System.in);	
	
	System.out.println("Please enter any word");
    String word = scan.nextLine();
		String pal ="";
		for ( int a = word.length()-1; a>=0; a--) {
			pal +=word.charAt(a);
		}
		if (word.equalsIgnoreCase(pal)) {
			System.out.println("The string " + word + " is palidrom");
		}
		else System.out.println("The string " + word + " is not palindrome!");
	}

}
