package com.syntax.class07;

import java.util.Scanner;

public class HomeWorkSwitch1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number");
        String grade = scan.nextLine();
        String explanation;
        switch(grade) {
        case "A":
        	
        	explanation = "Excellent";
        	break;
        	
        case "B":
        	explanation = "Good";
        	break;
        case "c":
        	explanation = "Average";
        	break;
        case "D":
        	explanation = "Bad";
        	break;
        	default:
        		explanation = "Not Acceptable";
        	
        }
		System.out.println("YOUR grade is " + grade + " - " + explanation + " ! ");
		
		
	}

}
