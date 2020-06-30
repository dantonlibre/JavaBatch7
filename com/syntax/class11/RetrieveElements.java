package com.syntax.class11;

public class RetrieveElements {

	public static void main(String[] args) {
		
	
	char[] grades = {'A','B','C','D','F'};
	//getting all elements
	for (int i = 0; i < grades.length; i++) {
	
	System.out.println(grades[i] + " . ");
	}
	System.out.println();
	
	System.out.println("----Print using advance loop---");
	for(char element : grades) {
		System.out.print(element + " ");
	}
	System.out.println("-------------------------------");
	String[] fruits = {"Apple","Orange","Grapes","Banana","Cucumber"};	
	
	// print all the fruits in 2 different ways
    for (int i = 0; i < fruits.length; i++) {
	System.out.println(fruits[i] + " ");
    }
	System.out.println();
	
	System.out.println("---------------");
	for (String f : fruits) {
		System.out.println(f);
	}
	
	System.out.println("--------------");
	
	
		}
	}	


