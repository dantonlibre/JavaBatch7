package reviewclass4;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		
		System.out.println("Please enter your age: ");
		Scanner scanner=new Scanner(System.in);
		
		int age=scanner.nextInt();
		
		if(age>=18) {
			System.out.println("you can drive in US");
		}else {
			System.out.println("You need to grow up");
		}
		System.out.println("-----------------------");
		
		System.out.println("Enter True or False");
		boolean trueOrfalse=scanner.nextBoolean();
		System.out.println("You enter :"+trueOrfalse);
		
		
	}
	
}
