package com.syntax.class34;
import java.util.LinkedList;
public class ripl {

	 LinkedList n= new  LinkedList();
		static int arr[] = {111, 222, 333, 444, 555, 666}; 
	       
	     // method for sum of elements in an array  
	     static int sum() 
	     { 
	         int sum = 0; // initialize sum 
	         int i; 
	        
	         // Iterate through all elements and add them to sum 
	         for (i = 0; i < arr.length; i++) 
	            sum +=  arr[i]; 
	        
	         return sum; 
	     } 
	       
	     // Driver method 
	     public static void main(String[] args)  
	     { 
	         System.out.println("Result of sum is " + sum()); 
	        } 
	 } 
   


