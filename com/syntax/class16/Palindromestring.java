package com.syntax.class16;

import java.util.Scanner;

public class Palindromestring {
	
	public static void main(String[] args) {
		
		//How would you check if String is palindrome or not?	
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter any word to check");
		String word= scan.next();
	    String reverseWord="";
	    
	    for(int i = word.length() - 1; i >= 0;i--) {
	    	reverseWord+=word.charAt(i);
	    }
	    if (reverseWord.equalsIgnoreCase(word)){
		    System.out.printf(" %s is palidrome",word);
	    }else {
	    	System.out.printf(" %s is not palidrome",word);
	    }
	     scan.close();
	}
}
