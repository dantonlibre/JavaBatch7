package com.syntax.class02;

public class HomeWork2 {

	// HW
	//Write a Java program to add, subtract, multiply and divide 2 decimal values. 
	//Your program should say. "The _______ of 2 numbers ___ and ___ is equal to _____"
	//Write  a program to find the square of the number 3.9. You program should say "The square of the ____ is ____ "
	//Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8.
	//Your program should say. "The perimeter of a rectangle with width ___ and height ____ is equal to _____ and the area is __"
	
	
	public static void main(String[] args) {
		//decimal values
		double num1 =3.4;
		double num2 = 4.5;
		
		
		//1. operations
		double add = num1+num2;
		double sub = num1-num2;
		double mult = num1*num2;
		double divide = num1/num2;
		
		//2. Strings operations
		String task1 = "addition";
		String task2 = "substraction";
		String task3 = "multiplication";
		String task4 = "division";
		
		//3.  statement
		System.out.println(" The " + task1 +  " of 2  numbers " + 3.4 + " and " + 4.5 + " is equal to " + add);
		System.out.println(" The " + task2 +  " of 2  numbers " + 3.4 + " and " + 4.5 + " is equal to " + sub);
		System.out.println(" The " + task3 +  " of 2  numbers " + 3.4 + " and " + 4.5 + " is equal to " + mult);
		System.out.println(" The " + task4 +  " of 2 numbers "  + 3.4 + " and " + 4.5 + " is equal to " + divide);
		
		
		
		//2. Write  a program to find the square of the number 3.9. You program should say "The square of the ____ is ____ "
		
		double num = 3.9;
		double squareOfNum = num*num;
		
		System.out.println(" The square of the number " + 3.9 + " is " + squareOfNum);
		
		//Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8.
		//Your program should say. "The perimeter of a rectangle with width ___ and height ____ is equal to _____ and the area is __"
		
		int width = 5;
		int height = 8;
		int area = width * height;
		int perimeter = 2 *(width+height);
		
		System.out.println(" The perimeter of a rectagle with width " + width + " and height " + height + " is equal to " + perimeter + " and area is " + area);
		
		
		
		
	     }
    }
	

	
	
	
	
	
	
    
	

