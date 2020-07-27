package com.syntax.class18;

public class LocalVariables {

	public static void main(String[] args) {
	
	String name ="Mohammad";//local to main method and its scope only with in main method
	
	for(int i=1; i<=5;i++) {
	System.out.println("Today is a Java Class");
	System.out.println(i);
	}
	int a;//declare a variable 
	
	for( a=0;a<=3;a++) {
		System.out.println(a);
	}
	System.out.println(a);
}
	
   void displayName() {
//	   System.out.println(name); name is not be resolved to a variable
//	                          name is not visible to the displayName methods because it local to main
	   
   }
   int sum(int num1,int num2) {
	   return num1+num2;//num1 and num2 local variables to method sum
   }
   
   double div(double num1, double num2) {
	   return num1/num2;
   }
}
