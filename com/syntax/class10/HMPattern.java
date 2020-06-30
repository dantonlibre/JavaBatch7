package com.syntax.class10;

public class HMPattern {
	 public static void main(String[] args) {
		
	
//1	//55555
	//4444
	//333
	//22
	//1
	
	
//2	//54321
	//4321
    //321
	//21
	//1
//1	
	for(int r = 5;r>=1;r--) {
		for(int c = 1;c<=r;c++) {
			System.out.print(r);
		}
		System.out.println();
	}
	
	System.out.println("--------------");
	//2
	for(int r = 5;r>0;r--) {
		for(int c = r;c>=1;c--) {
			System.out.print(c);
		}
		System.out.println();
	
	//3  
		for (int row = 1; row<=4;row++) {
			
	
		for (int col = row;col>=1;col--) {
			System.out.println(col);
		}
		System.out.println();
		}
		for(int i = 5;i>=1;i--) {
			for(int j = 1;j<=r;j++) {
				System.out.print(r);
			}
			System.out.println();
	
	
	}
	
	 } 
}
}	
	
	
	
	
	
	
	
	
	





