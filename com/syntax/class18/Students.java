package com.syntax.class18;

public class Students {

//	Create a Class called Students
//	Create three  variables  studentName , studentID  and  numberOfStudents
//	Create three objects of the Students Class 
//	Set the value for  studentName , studentID and increment  the numberOfStudents for each object
//	Print out  total number of students
	String studentName;
	int studentID;
	static int numberOfStudents=35;
	public static void main(String[] args) {
	Students obj=new Students();
	obj.studentName = "Gora";
	obj.studentID = 13;
	numberOfStudents++;
	
	Students obj1=new Students();
	obj1.studentName = "Griwa";
	obj1.studentID = 18;
	numberOfStudents+=3;
	
	Students obj2=new Students();
	obj2.studentName = "Wlema";
	obj2.studentID = 12;
	numberOfStudents+=6;
	
	
	
	System.out.println("Number of students" + numberOfStudents);
	
	
	
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

