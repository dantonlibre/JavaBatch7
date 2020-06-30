package com.syntax.class15;

public class HM {


//Create a String and if the String is not empty perform the following: 
//if the String has an odd number of characters and has 3 or more characters, 
//print the character in the middle of the String.

	public static void main(String[] args) {
		
			String str = "character", reverse = "";
			
			 for (int a = str.length()-1; a >0; a-- ) {
				 reverse +=str.charAt(a);
			 }
			 System.out.println(reverse);

		}

	}		
		
		
		
		
		
		
		
		
		

