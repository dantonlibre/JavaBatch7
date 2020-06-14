package com.syntaxclass4;

import java.util.Scanner;
     
     public class ScannerExample12 {
	      
    	 public static void main(String[] args) {
		
	
	  // Capture the name from the user and print
	  //your name is________
	
	  //Ask the user to enter the age and print
	  //Your name is _____and age is_______
	
	  //we are instructing the user what to enter
      Scanner input = new Scanner(System.in);
    	 
      //we are instracting the user what to enter
      System.out.println("Please enter your full name");
	  //We are capturing the whole line into a text variable
      String name = input.nextLine();
      System.out.println("your name is" + name);
      
      //We are instracting the user what to enter
      System.out.println("Please enter your name as a double");
	  
	  //we are capturing the text as a double
      //if is not a double, then an error/exception will be printed
      double albanianAge = input.nextDouble();
      System.out.println("your name is" + name + "and age is" + albanianAge);
     }    
}
