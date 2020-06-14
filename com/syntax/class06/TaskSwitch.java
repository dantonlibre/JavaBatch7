package com.syntax.class06;

import java.util.Scanner;

public class TaskSwitch {
	
	public static void main(String[] args) {
		//Ask user to enter their country and capture it. 
		//Once values are captured print which language user speaks.
		
		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your country: ");
		String language = scan.next();
		
		switch(language) {
		case"usa":
		case"england":
		case"poland":
		case"britan":
			language = "English";
			break;
		case"russia":
			language= "Russian";
			break;
		case"ukraine":
		    language = "Ukrainian";
		    break;
		    default:
		    	language = "unknown";
		    	break;
		}
		System.out.println("Your language is " + language);
		
		scan.close();
		
		
		
		
	}

}
