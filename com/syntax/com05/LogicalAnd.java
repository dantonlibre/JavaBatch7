package com.syntax.com05;

public class LogicalAnd {
	
	public static void main(String[] args) {
		
		//Declare a number
		// If number is between 1-10--> number is small
		// If number is between 1-100--> number is big
		// If number is between 1-10--> number is large
		
		int num = 194;
		
		if (num >= 1 && num <=10 ) {
			System.out.println(num + "is a small number");
		}else if(num > 10 && num <=100) {
			System.out.println(num + "is medium number");
		}else if(num > 100 && num <= 1000) {
			System.out.println(num + "is a large number");
		}else {
			System.out.println("Number is out of range");
		}
	}
}

