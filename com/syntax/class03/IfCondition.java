package com.syntax.class03;

public class IfCondition {
	
	public static void main(String[] args) {
		//Declare a number compare if the number is larger than 100
		//If it is larger than 100,I will print --> My number is large
		
		int num = 78;
		System.out.println("Let us check");
		
		if(num>100) {
			System.out.println("My number is large");
		}
		System.out.println("The check is complete");
		
		boolean result = (num >100);
		if (result) {
			System.out.println("The result is true");
		}
		
		System.out.println("______________________");
		int expectedHours = 15;
		int actualHours = 15;
		
		if(actualHours >=expectedHours) {
			System.out.println("You will love Java");
		}else {
			System.out.println("You will Not love Java");
		}
		
		System.out.println("__________________________");
		double budget = 15000;
		double carPrice = 15000;
		
		if (budget > carPrice) {// Iwill buy only if i have more money
			System.out.println("Iwill buy this car");
			System.out.println("i am happy");
		}else {// otherwise
		    System.out.println("Iwill Not buy this car");
		    System.out.println("Iwill study Java");
		    System.out.println("I will find a job");
		    System.out.println("Then, i will have money");
		}
	}
}
		
		
		