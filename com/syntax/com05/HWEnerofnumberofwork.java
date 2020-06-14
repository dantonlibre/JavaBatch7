package com.syntax.com05;

import java.util.Scanner;

public class HWEnerofnumberofwork {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your number of working year!");
		int years = scan.nextInt();
		
		System.out.println("Please enter your annual salar!y");
		double salary = scan.nextDouble();
		
		
		if (years>=5) {
			System.out.println("you are eligeble for the"
					+ " bonus!");
			
			if (salary>50000) {
				System.out.println("Your bonus is 5000");
			}else {
				System.out.println("Your bonus is 3000");
			}
			}else {
				System.out.println("You are Not eligible for bonus");
		}
		
		
	}

}
