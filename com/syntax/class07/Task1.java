package com.syntax.class07;

public class Task1 {
	public static void main(String[] args) {
		
		//How to print 50 to 1
	       //How to print odds from 1 to 20
		
		//1 way, using mod(%)
		int x = 1;
		while(x<20) {
			if (x % 2 ==1) {
				System.out.println(x);
			}
			x++;	
		}
		
		System.out.println("----------");
		//2 way, increasing by 2
		
		int y = 1;
		while (y <= 20){
			System.out.println(y);
			y += 2;
		}
		
		System.out.println("-------------");
		
		//3 way
		int z = 0;
		while (z < 20) {
			z++;
			System.out.println(z);
			z++;
			
			System.out.println("-------------");
			// 4th way
			int g = 0;
			while (g < 20) {
				System.out.println(++g);
				g++;
			}
		}
		
	}

}
