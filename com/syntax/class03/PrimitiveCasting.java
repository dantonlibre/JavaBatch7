package com.syntax.class03;

public class PrimitiveCasting {
	
	public static void main(String[] args) {
		//widening,implicit casting,automatically
		//double d = (double) 7;
		double d = 7.0;
		System.out.println(d);
		
		//int i = 7.58; //compile time error:Type mismatch:cannot convert from double to int
		//double to int
		
		//narrowing (explicit casting,manually0
		int i = (int) 7.58;
	     System.out.println(i);
		
	     //narrowing a large number into a byte
	     
	     //explicitly doing it,manually
	     byte b = (byte) 123865;
	     System.out.println(b);
	     
	    
	     ;
	     
	     
	     //you are trying to fit something
	     //you are trying
	     //from a big box into a small
	     long l1 = 45;
	     int number1 = (int)l1;
	     System.out.println("number 1 = " + number1);
	     
	     long l2 = 495950066L;
	     int number2 = (int)l2;
	     System.out.println("number 2 = " + number2);
	     

	
	}
	
	
}
