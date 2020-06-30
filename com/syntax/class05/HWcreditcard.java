package com.syntax.class05;

import java.util.Scanner;
  
public class HWcreditcard{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean cc;
		
		System.out.println("Do you have a credit card?(true or false)");
		cc = scan.nextBoolean();
		
		if(cc) {
			
		
			System.out.println("What is your Credit Card balance?");
			double balance = scan.nextDouble();
			
			if (balance>1000) {
				System.out.println("Please pay off immediately!");
			}else {
				System.out.println("You can spent more");	
			}	
		  } else {
			System.out.println("Let me offer you our best credit Card!");
		}
		
	}	
}	
	
		
		
		
		
		
		
		
	

	
	

