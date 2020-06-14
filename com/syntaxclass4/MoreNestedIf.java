package com.syntaxclass4;

public class MoreNestedIf {

	public static void main(String[] args) {
		
		// Let's have a date of month and a day of week
		//if it is Friday-->
		//                     If date is 13 -->Watch a scare movie
		//                     if date is not 13 -->Watch a comedy
		//i it is not Friday --> we are going to study Java                     
		boolean isFriday = true;
		int date = 23;
		
	
		if (isFriday) {
			System.out.println("It is Friday.I am going to watch a movie!");
		
		 if(date == 13) {
			 System.out.println("I will watch a SCARY movie");
		 }else {
			 System.out.println("I will watch a comedy");
		 }
		 }else {
			 System.out.println("It is Not Friday.I am going to study");
		 }
	}
}
