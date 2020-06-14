package reviewclass4;

import java.util.Scanner;

public class ScannerWithNestedIf {
	
	

	public static void main(String[] args) {
		
		System.out.println("Is the button Displayed");
		Scanner scan=new Scanner(System.in);
		
		boolean isDisplayed=scan.nextBoolean();
		
		System.out.println("Is the checkbox selected");
		boolean isSelected=scan.nextBoolean();
		
		if (isDisplayed) {
			System.out.println("Checkbox is displayed");
			if(isSelected) {
				System.out.println("Checkbox is already selected");
			}else {
				System.out.println("it is not selected you can click on it");
			}
		}else {
			System.out.println("the checkbox is NOT Displayed");
		}
	}
	
}

