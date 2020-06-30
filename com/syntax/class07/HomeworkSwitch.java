package com.syntax.class07;

import java.util.Scanner;

public class HomeworkSwitch {
	
	public static void main(String[] args) {
		//Ussing scanner class create calculator.
		//Allow user to enter 2 numbers and operator(+, -, *,/).
		
		        Scanner scan = new Scanner(System.in);
		        double result=0;
		
		        System.out.println("Please enter first number");
				double num1 = scan.nextDouble();
				
		        System.out.println("Please enter second number");
		        double num2 = scan.nextDouble();
		        
		        System.out.println("Please enter one of the operators( +, -, *, /;");
		        char operator = scan.next().charAt(0);

		
		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num2 * num2;
			break;
		case '/':
			result  = num1 / num2;
			break;
			default:
            result = 0;
            System.out.println("Invalid operator");
		}
            System.out.println("The result  is: " + result);
		}	
	}

		
		
		
		
		
		
	
	
	
	
	
	


