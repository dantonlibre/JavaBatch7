package com.syntax.class10;

public class $Magic {
	
	public static void main(String[] args) {
		//Lets print the dollar
		//$$$$
		//$  $
		//$  $
		//$  $
		//$$$$
		
		for(int r =1; r<=5;r++) {// The outer loop controls the rows
		
			for(int c = 1; c<=4; c ++) {// The inner loop controls the colums
				
				if (r==1 || r ==5) { // in the ferst or last row print everthing
				System.out.print("$");
				
				}else {//in the other rows
					
					if(c==1 || c==4) {// in the first or last column print $
						System.out.print("$");
					}else { //in the other columns
						System.out.print(" ");
					}
				}
				
			}
		System.out.println();
	}
 }

}