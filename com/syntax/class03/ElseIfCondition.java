package com.syntax.class03;

public class ElseIfCondition {
	
	public static void main(String[] args) {
		double num1 = 10.7;
		double num2 =10.7;
		
		System.out.println("-----Different way----");
		
		if (num1>num2) {
			System.out.println("number1 is larger than number2");
		}else if (num1 < num2){
			System.out.println("number1 is smaller than number2");
		}else if(num1 < num2){
			System.out.println("Numbers are equal");
		}else {
			System.out.println("You will never come here!");
			
		}
		System.out.println("We are done");
	}

}
