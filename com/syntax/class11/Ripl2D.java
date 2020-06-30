package com.syntax.class11;

public class Ripl2D {
//	Create a 2D array where you will store the following values: Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
//	After storing values print the following:Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
//	1.Create a 2D array that first row will contain 4 names and second row will contain grades.
//	Then you program should print name of the students that has A and B grade
	public static void main(String[] args) { 
    String[][]names = { {"Mr", "Mrs", "Ms", "Miss"}, 
    	   {"Smith", "Jordan", "Jackson", "Obama"} };	
	System.out.println(names[0][1] + " " + names[1][0]);
	System.out.println(names[0][0] + " " + names[1][3]);
    System.out.println(names[0][2] + " " + names[1][2]);
    System.out.println(names[0][3] + " " + names[1][1]);
    System.out.println("-----------------------------");
	
//    Create a 2D array that first row will contain 4 names and second row will contain grades. 
//    Then you program should print name of the students that has A and B grade
	
    String[][]arrays = { {"Valera", "Jora", "Griwa", "Vasya"}, 
                          {"A", "B", "C", "D"} };
    System.out.println(arrays [0][0] + " has grade " + arrays[1][0]);
    System.out.println(arrays [0][1] + " has grade " + arrays [1][1]);
    System.out.println("--------------------------------------------");
    
//    Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
//    Develop a program which will identify/print the even numbers only.
    
    int [][]numbers = {{45, 66, 80, 90}, {10, 11, 12, 13}, {56, 67, 87, 98}};
    for (int a=0;a<numbers.length;a++) {
      for(int b=0;b<numbers[a].length;b++) {
         if (numbers[a][b] % 2 == 0) {
    System.out.print(numbers [a][b] + ",");

    }
   }
  }
//    Create an array of cars : american, german, korean, italian. 
//    Then retrieve all values from that array using 2 different loops
    String[][] cars = {{"Dodge", "Tesla", "Ford"},{"BMW", "Audi", "Opel"},{"Kia", "Hynday", "SangYong"},{"Fiat", "Alfa Romeo", "Ferari"}}; 
    for (int i = 0;i<cars.length;i++) {
    	for(int j=0;j< cars[i].length;j++) {
    	System.out.println(cars[i][j]);
    	}
    }
 }
}