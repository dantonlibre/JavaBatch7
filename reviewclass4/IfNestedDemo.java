package reviewclass4;

public class IfNestedDemo {

	public static void main(String[] args) {
		
		int age = 5;
		
		if(age==5) {
			System.out.println("you 5 years old");
		}else if (age==6) {
			System.out.println("You are 6 years old");
		}
		
		System.out.println("------------------------");
		
		
		
		
		boolean checkBoxIsDisplayed=false;
		boolean checkBoxIsSelected=false;
		
		
		
		if (checkBoxIsDisplayed) {
			System.out.println("Check box is Displayed");
			
		if (checkBoxIsSelected) {
			System.out.println("check box is selected");
		}else {
			System.out.println("click on checkbox");
		}
		
		}else {
			System.err.println("Check box is not Displayed");
		}
		
	}
	
	
}
