package com.syntax.class11;

public class Arrayrecap {

	public static void main(String[] args) {
		
	
	int[] grades = new int[5];
	grades[4] = 90;
	
	int size = grades.length;
	System.out.println("array size is: " + size);
	
	
	grades [4] = 90;
	grades[3] = 85;
	grades[2] = 92;
	grades[1] = 75;
	grades[0] = 100;
	
	//What is the average of the class?
	int average =( grades[0] + grades[1] + grades[2] + grades[3]+ grades[4]) / size;
	System.out.println("Class average is :" + average);
	//1 silly way
	int total = 0;
	for (int k = 0; k < size; k++) {
		total +=grades[k];
	}
	System.out.println("Class average is : " + total / size);
	

	System.out.println("-----------------------------------------------------");
	
	String[] cities = {"Fairfax", "Kiev", "Tampa","Moskow","Newark","NYC","Lviv","Chicago"};
	System.out.println("I live in " + cities[2]);
	
	int i = 1;
	System.out.println("I live in " + cities [i]);
	
	i+=2;
	System.out.println("I moved to " + cities[i]);
	
	int cityLength= cities.length;
	
	System.out.println("Total nuber of cities is :" + cityLength);
	
	System.out.println("The last city in the list is: " + cities[cityLength - 2]);
	
	System.out.println("------------------------------------------------------");
	
	// I want to print all the cities
	//cities[0], cities[1], .... cities[7]
	for (int j = 0; j<8; j++) {
		System.out.println(cities[j]);
	}
	
	
}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

