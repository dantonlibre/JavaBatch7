package com.syntax.class04;

import java.util.Scanner;

public class ScannerIfElse {
	
	public static void main(String[] args) {
		//ctrl +shift +o
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a amount");
		int num = scanner.nextInt();
		
		System.out.println("Please enter another  number");
		int num1 = scanner.nextInt();
		
		System.out.println("-----------------------------");
		System.out.println("Number are " + num + "and" + +num1);
		System.out.println("-----------------------------");
		//Ask the user to enter two numbers
		//Compare the number and print which on is larger
		
		if(num>num1) {
			System.out.println(num + "is larger than" + num1);
		}else if (num<num1) {
			System.out.println();
			
		}
		
		
		
	}

}
