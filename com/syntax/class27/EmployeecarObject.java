package com.syntax.class27;
public class EmployeecarObject {
	
	   String name;
	   String  lastName;
	   int employeeId;
	   String startDate;
	   int salary;

	EmployeecarObject( String name, String  lastName,int employeeId, String startDate, int salary){
		this.name=name;
		this.lastName=lastName;
		this.employeeId=employeeId;
		this.startDate=startDate;
		this.salary=salary;
	}
	EmployeecarObject(){
		this.name="Joe";
		this.lastName="Smith";
		this.employeeId=12345;
		this.startDate="01/01/1970";
		this.salary=35000;
	}
		void display() {
			System.out.println(name+ " " +lastName+ " "+ employeeId+" "+startDate+ " "+salary);
	
}}
