package com.syntax.class17;

import java.util.Scanner;

public class Output {
	 public static void main(String args[]) { 
		

		 
		 Scanner sc = new Scanner(System.in); 
		    System.out.println("Enter the browser name to proceed further with execution");
		    String browser = sc.nextLine();
			String message;
			
		    switch(browser.toLowerCase()) {
		case"chrome":
		     message="Proceed with Chrome browser";
		     break;
		case"firefox":
			message="Proceed with Firefox browser";
			break;
		case"ie":
			message="Proceed with IE browser";
			break;
			default:
			message="Invalid brawser";	    
	   }
		    System.out.println(message);	

	 }}
	