package com.syntax.com05;

public class MOreLOgicalOperators {
	
	public static void main(String[] args) {
		
		//We have 7 days of week
		//if day is 2,4 -->SDLC class
		//if day is 6,7 -->Java class
		//if day is 1,5-->No class
		//if day is 3 -->Review class
		
		int day = 7;
		
		if (day==2 && day ==4) {
		      System.out.println("SDLC class");
		}else if(day == 6 || day ==7) {
			System.out.println("Java class");
		}else if(day == 1|| day ==5){
			System.out.println("No class");
			System.out.println("Java class");
		}else if(day == 3|| day ==5){
			System.out.println("Review class");
		}else {
			System.out.println("Wrong day");
		}
		System.out.println("_________Using String_________");
		// To compare the equality of two String we use.equals()
		
		String day2 = "Tuesday";
		if (day2.equals("Tuesday") || day2.equals("Sunday")){
			System.out.println("SDLC class");
		}else if (day2.equals("Saturday") || day2.equals("Sunday")) {
			System.out.println("Java class");
		}else {
			System.out.println("Not implemented");
		}	
		
	}

}
