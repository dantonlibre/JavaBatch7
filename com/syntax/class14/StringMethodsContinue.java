package com.syntax.class14;

public class StringMethodsContinue {

	public static void main(String[] args) {
		
		System.out.println("-----------------.contains()method-----------------");
		//checks is String contains another sequence of specified characters
		String str = "Good afternoon all";
		
		
		boolean contains=str.contains("afternoon");
		System.out.println(contains);
		
		String searchValue="good";
		
		boolean isItThere=str.contains(searchValue);
		System.out.println(isItThere);
		
		System.out.println(str.contains("A"));
		System.out.println(str.contains("after"));
		
		System.out.println("--------------.startWith()method---------------------");
		
		String drink="water";
	}
	
	
	
}
