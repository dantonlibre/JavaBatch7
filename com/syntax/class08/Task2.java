package com.syntax.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		//Create a program that will be asking user to apply for a credit card 10 times. 
		//As soon you get an �yes� from a user program should stop asking.
		
	
		Scanner scan = new Scanner(System.in);
		
		for(int i =101; 1 <=110; i++) {
			System.out.println("Do you want to aply for credit card?");
			String answer = scan.next();
			
			if (answer.contentEquals("yes")){
				System.out.println("Congrats. Now you are in debt");
				break;
			}
		}
		
		
		
		
	}	
}
