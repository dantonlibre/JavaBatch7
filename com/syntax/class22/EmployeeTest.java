package com.syntax.class22;

public class EmployeeTest {
	public static void main(String[] args) {
	
		ScrumTeam obj1 = new ScrumTeam();
		ScrumTeam.companyName="Facebook";
		obj1.fullName="John Doe";
		obj1.salary = 70000;
		//obj1.ssn- not visible
		obj1.getPaid();
		obj1.work();
		
		obj1.attendsMeetings();
		obj1.ceremonies = "Scrum meetings";
		obj1.workOnBuildingsSoftware();
		
		ProductOwner obj2 = new ProductOwner();
		//ProductOwner.companyName grandchild have an access TOO
		obj2.salary = 100000;
		obj2.getPaid();
		obj2.work();
		
		obj2.ceremonies = "Scrum meetings";
		obj2.attendsMeetings();
		obj2.workOnBuildingsSoftware();
		
		obj2.communicate();
	}
}