package com.syntax.class15;

public class SplitFunction {
	
	public static void main(String[] args) {
		
	
//	Create a String that will hold a sentence. 
//	Write a program to get a new String without any spaces.

	String name="Today is Java class";
	
	name=name.replaceAll(" ","");//Hello friends 
	System.out.println(name);
	
System.out.println("------------jhgjh_______________");
	


//reate a String that should be combination of letters, numbers and special characters. 
//Find out how many alpha characters are there in the String.
String mix="A-Z 12345 <>,";
	mix=mix.replaceAll("[^A-za-z]", "");
	System.out.println(mix.length());
	}
	
}
