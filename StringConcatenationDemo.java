
public class StringConcatenationDemo {

	public static void main(String[] args) {
		// I love Castro
		String name = " Castro";
		
		System.out.println("I love + name");
		
		System.out.println("I love"+ "" + name);
		
		System.out.println("Ilove" + name);
		
		String statement = "I love";
		
		// Idon't want to change my variables
		System.out.println("-----------------") ;
		
		String car = "BMW";
		int year = 2020;
		
		//Concatenation of two Strings
		System.out.println(car +  "of  year" + year);
        
		//Concatenation of 
		System.out.println("BMW of year" + "2020");
	

	}
}
   