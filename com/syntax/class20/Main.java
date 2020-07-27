package com.syntax.class20;

public class Main {
	
//	Then complete the method by programming the following behavior
//	Insert spaces after every character in the String s, then return the new string.
//	See below examples (note the space at the end as well).
//
//	Examples:
//	spaceOut("hello") ==> "h e l l o "
//	spaceOut("technology") ==> "t e c h n o l o g y "
	
	
	
	void spaceOut(String s){
		String s1 = "hello";
		String s2 = "technology";
		s1 = s1.replaceAll("[A-Za-z] ", " ");
		s2 = s2.replaceAll(" ", " ");
		
	System.out.println(s1);
	}
		 public static void main(String[] args){
				    Main obj = new Main();
				    obj.spaceOut("hello");
				    obj.spaceOut("technology");
		 }}
		