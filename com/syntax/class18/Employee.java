package com.syntax.class18;

public class Employee {


//Create a Class called Employee:
//Create three  variables  eID , salary and set the CEO to “Sumair” 
//Create two objects of the class Employee 
//Set the value of eID, salary for each of the objects
///Print out the eID ,salary and  CEO for each of the objects
	int eID;
	double salary;
	
	static String CEO="Sumair";
	
	public static void main(String[] args) {
		
		System.out.println(Employee.CEO);
		
		//accessing static variables within same class
		System.out.println(CEO);
		
		//accessing static method
		sayHelloToCeo();
	}
	
	static void sayHelloToCeo() {
		System.out.println("Hi "+CEO);
		
//		Employee obj=new Employee();
//		obj.eID = 123456;
//		obj.salary = 20.45;
//		sayHelloToCeo();
		
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	

