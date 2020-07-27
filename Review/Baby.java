package Review;

public class Baby {
	
    String hairColor;
	String firstName;
	String lastName;
	int weaight;
	char gender;
	
	
	public void cry() {	
		
		System.out.println("cry every minute......");
		;
    }

	 void walk() {
		
		System.out.println("crawling....");
		;
		
	}
	 void talk(int times) {
		 for(int i = 0; i < times; i++) {
		System.out.print("ga ");
	}
	 }
	public void displayInfo() {
		System.out.println("The full name is: " + firstName + " " + lastName);
		if (gender == 'M') {
		System.out.println("It is a boy");
		}else if (gender=='F') {
		System.out.println("It is a girl");
	
	    }else {
	    	System.out.println("it is unknown");
		}
		System.out.println("The hair color is: " +  hairColor);
	}}
