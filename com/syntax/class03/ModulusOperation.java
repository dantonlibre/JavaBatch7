package com.syntax.class03;

public class ModulusOperation {
	public static void main(String[] args) {
		double d1 = 12.5;
		double d2 = 4.7;
		double doubleresult = d1/d2;
		System.out.println(" float result is " + doubleresult);
		
		float f1 = 12.5f;
	    float f2 = 4.7f;
	    float floatResult = f1/f2;
	    System.out.println(" float result is " + floatResult);
	    
	    System.out.println("---------------------");
	    
		
		
		int i = 14;
		int j = 4;
		int result2 = i/j;   // 1.875
		//double result3 = i/j;
		
		
		System.out.println(result2);
   //   System.out.println(result3);
	
		int mod = i % j;
		System.out.println(" The remainder is " + mod);
		
		double num1 = 14;
		double num2 = 4;
		double div = num1/num2;
		System.out.println(" If we divide doubles the result is " + div);
		 
		
		System.out.println("---------------------");
		
		i = 18;
		j = 4;
		
		mod = i % j;
		System.out.println();
		
	}
	
}
