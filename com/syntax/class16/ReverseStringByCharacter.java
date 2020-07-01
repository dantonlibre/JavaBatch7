package com.syntax.class16;

import java.util.Scanner;

public class ReverseStringByCharacter {
	
	public static void main(String[] args) {
	
		//How would you reverse a String character by character?	
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter any word");
		String word= in.next();
		
		System.out.printf(" %s in reverse would be:",word);
		for(int i = word.length() - 1; i >= 0;i--) {
			System.out.print(word.charAt(i));
		}
		in.close();
		
	}


}
