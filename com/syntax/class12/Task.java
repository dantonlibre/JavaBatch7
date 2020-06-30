package com.syntax.class12;

public class Task {
	
	public static void main(String[] args) {
		//create a 2 d that will store food of different kinds
		//and retrieve all values from that array using 2 different loops
		
		String[][]food = {{"Pelmeni", "vareniki", "borw"},
				        {"carbonara", "pizza","lazania"},
		                {"sushi", "miso soup","chumai"}};
		     for(int i=0;i<food.length;i++){
		        for(int c=0;c<food[i].length;c++) {
		        	System.out.println(food[i][c] +" ");
		        }
		        System.out.println();
		     }
		     
		     System.out.println("--------------------------------");
		     
		     int[][] numbers= {
		    		 {10, 23, 56, 47},
		    		 {33, 668, 89},
		    		 {1, 9, 0}	 
		     };
		     
		     //regular for loop
		     
		     int sum=0;
		     
		     for(int i=0; i<numbers[i].length;i++) {
		    	 for(int j=0; j<numbers[i].length;j++) {
		    		 
		    		 int element=numbers[i][j];
		    		 
		    		 if (element%2!=0) {
		    			 sum+=element;
		    		 }
		    		
		    	 }
		     System.out.println(sum);
		     }
		}
		
	}


