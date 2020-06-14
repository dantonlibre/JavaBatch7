package com.syntax.com05;

import java.util.Scanner;

public class Ifbaracets {
	
	public static void main(String[] args) {
		
		
		boolean isHoliday = true;
		
		if (isHoliday) {
			System.out.println("I will sleep all day");
			System.out.println("I will play with my kids");
		}else
				System.out.println("I will work hard");
		        System.out.println("I am smart");
		        //Alway format your code!!!
		
		        
		  System.out.println("--------------------");      
		        
		  Scanner scan = new Scanner(System.in);
			System.out.println("Enter your birth month");
			
			
			String month = scan.nextLine();
			
			System.out.println("You were born in");
		
			if(month.equals("June")  ||month.equals("July")  ||month.equals("August")){
			            System.out.println("You were born in Summer");
			}        
			else if(month.equals("September")  ||month.equals("October")  ||month.equals("November")){
				        System.out.println("You were born in Fall");
			}
          else if(month.equals("December")  ||month.equals("January")  ||month.equals("Febryary")){
                      System.out.println("You were born in Winter");
          }
          else if(month.equals("Marth")  ||month.equals("April")  ||month.equals("May")){
          	        System.out.println("You were born in Spring");		
			
          }    	
     
	   }
}
      
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		


