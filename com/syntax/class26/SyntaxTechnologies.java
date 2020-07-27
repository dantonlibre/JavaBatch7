package com.syntax.class26;

public class SyntaxTechnologies {
//	* schoolName(String)
//	* batch(int)
//	* year(int)
//	* lastDayOfClass(String)
//	Write two constructors:
//	* non-argument constructor
//	* parameterized constructor
//	Create method to display values of instance variables.
	String schoolName;
	int batch;
	int year;
	String lastDayOfClass;
	
	SyntaxTechnologies(){
		System.out.println();
	}
	SyntaxTechnologies(String schoolName, int batch, int year, String lastDayOfClass){
		System.out.println(schoolName+batch+year+lastDayOfClass);
	}
	public void display() {
		System.out.println(schoolName+ " " +batch+ " "+year+ " "+lastDayOfClass);
	}
	
}
