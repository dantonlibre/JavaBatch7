package com.syntax.class22;

public class Employee extends Object{

	public static String companyName;//entire project
	protected String fullName;//same package unless inherited
	double salary;//same package
	private long ssn;//same class
	
	void work() {
	System.out.println("Employee works");
	} 
	void getPaid(){
		System.out.println("Employee gets paid");
	}
}
    class ScrumTeam extends Employee{

   
	String ceremonies;

    void attendsMeetings() {
	System.out.println("attends meetings");
}
    void workOnBuildingsSoftware() {
	System.out.println("works on building software");
}}
    class ProductOwner extends ScrumTeam {
		void communicate() {
			System.out.println("gets requirements for BA");
	    }
	    void prioritizePb() {
	    	System.out.println("prioritizes product backlog");
   }}
     class ScrumMaster extends ScrumTeam {
	 String quality;
		void shieldTeam() {
			System.out.println("All team shielded");
		}
		void doMeetings() {
			System.out.println("All team do attending meeting");
	}}
      class Tester extends ScrumTeam {
	 void test() {
		 System.out.println("Testing program");
	 }
 }
      class BussinessAnalist extends ScrumTeam{
       void gatherRequirements() {
    	   System.out.println("Get requirements");
       }
	
 }
 
 