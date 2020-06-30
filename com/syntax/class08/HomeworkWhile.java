package com.syntax.class08;

public class HomeworkWhile {
	
	
	//print numbers from 1-100
	public static void main(String[] args) {
		//1 way
		int x =1;
		while (x <= 100) {
		     System.out.println(x + " ");
		x++;
		}
		System.out.println("first way");
		
		//2 way
		x = 1;
		
		do {
			System.out.println(x +" ");
		   x++;
		}while (x<=100);
		
		//3r way
		System.out.println("2 way");
		  for(x =1; x <= 100; x++) {
			  System.out.println(x +" ");
		  }
		  System.out.println("3 way");
		}
  }

