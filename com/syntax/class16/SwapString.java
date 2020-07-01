package com.syntax.class16;

public class SwapString {
	public static void main(String[] args) {
		
	
		
		//How would you swap  2 strings without a temporary variable?
		
	String str1="Sunday";
	String str2="Monday";
	str1=str1.concat(" "+ str2);
	str2=str1.substring(0, str1.length() - str2.length() - 1);
	str1=str1.replace(str2, "").trim();
	 System.out.println("Str1 values is" + str1);
	 System.out.println("Str2 values is" + str2);
	
	}	
}
