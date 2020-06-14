package reviewclass4;

import java.util.Scanner;

public class ScannerClassDemo {
	public static void main(String[] args) {
		
		
		
		System.out.println("Please enter your name:");
		Scanner scn=new Scanner(System.in);
	
		 String firstName = scn.nextLine();
		 System.out.println("Your name is: "+firstName);
		 
		 System.out.println("Please enter your last  name");
		 String lastName = scn.next();
		 System.out.println("Your last name is: "+lastName);
		
		
	}

}
