package com.syntax.class13;

import java.util.Scanner;

public class Ripl {
//	Write a program that creates a String array with size 7. 
//	Ask the user to input Days of a week beginning with Sunday using Scanner class.
//	Add these inputs to your array and then print all values from that array
//
//	Example:
//	Please enter day 1 of the week
//	Sunday
//	Please enter day 2 of the week
//	Monday
//	Please enter day 3 of the week
//	Tuesday etc
	public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	String[]arr=new String[7];
	String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    System.out.println("Please enter day 1 of the week");
    String dayName=scan.nextLine();
	
    System.out.println("Please enter day 2 of the week");
    String dayName1=scan.nextLine();
	
    System.out.println("Please enter day 3 of the week");
    String dayName2=scan.nextLine();
    
    System.out.println("Please enter day 4 of the week");
    String dayName3=scan.nextLine();
    
    System.out.println("Please enter day 5 of the week");
    String dayName4=scan.nextLine();
    
    System.out.println("Please enter day 6 of the week");
    String dayNam5e=scan.nextLine();

    System.out.println("Please enter day 7 of the week");
    String dayName6=scan.nextLine();
    for(String day:days) {
    	System.out.println(day);
    }
    
	
     }
   

   
}

	
	
	


