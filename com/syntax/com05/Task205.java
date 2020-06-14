package com.syntax.com05;

import java.util.Scanner;

public class Task205 {
	
	
	
		public static void main(String[] args) {
			
			
			
			
			  Scanner scan = new Scanner(System.in);
				System.out.println("Enter your birth month");
				
				
				String month = scan.nextLine();
				System.out.println("You were born in");
			
				if(month.equals("June")  ||month.equals("July")  ||month.equals("August")){
				            System.out.println(" Summer");
				}        
				else if(month.equals("September")  ||month.equals("October")  ||month.equals("November")){
					        System.out.println("Fall");
				}
	            else if(month.equals("December")  ||month.equals("January")  ||month.equals("Febryary")){
	                        System.out.println("Winter");
	            }
	            else if(month.equals("Marth")  ||month.equals("April")  ||month.equals("May")){
	            	        System.out.println("Spring");		
				
	            }    	
	       
		   }

	   }
			
				
		 
		    
		    
		    
		    
		
