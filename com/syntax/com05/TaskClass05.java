package com.syntax.com05;

import java.util.Scanner;

public class TaskClass05 {
		//Prompt the user to enter person heights in inches. 
		//Person should be classified as one of the following:
			//• short (under 60 inch)
			//• medium(between 60 -72 inch)
			//• tall (over 72 inch)
			//-----------------------------------------
			//Write a program that will print whether it is a weekend or weekday.
			//If any day from 1-5 → output "It is a weekday", anyday from 6-7 → output "It is a weekend", any other day → output "Invalid day"
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your heights in inches");
		
		int heights= scan.nextInt();
		
		if (heights<=60 && heights >=60) {
			System.out.println("You are short");
		}else if (heights >= 60 && heights <= 72) {
			System.out.println("You are medium");
		}else if (heights>=72 && heights <=72) {
			System.out.println("You are tall");
		}else {
			System.out.println("------------");	
		}  
  
	} 
}
     
         