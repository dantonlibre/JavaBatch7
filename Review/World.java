package Review;

public class World {
	
	int capacity;
	
	public static void main(String[] args) {
		
		
		
		//Declaring a variable of type baby
		Baby baby1;
		
		//initialazing a variable
		baby1 = new Baby();
		
		//assign values to variables of baby1
		baby1.firstName = "Ali";
		baby1.gender = 'M';
		baby1.lastName = "Khan";
		
		//before we assign any hairColor, the default is null
		baby1.hairColor = "Brown";
		
		//reassign value to variables of baby1
		baby1.weaight = 8;
		
		
		System.out.println("The firstname of the baby is: " + baby1.firstName);
		System.out.println("The weight of the babu is: " + baby1.weaight);
		
		
		String lastNameOfBaby = baby1.lastName;
		System.out.println("The last name is:" + lastNameOfBaby);
		
		baby1.cry();
		baby1.walk();
		baby1.talk(10);
		
		baby1.displayInfo();
		System.out.println("------------------------");
		
		Baby baby2 = new Baby();
		baby2.firstName= "Inci";
		baby2.lastName = "Alem";
		baby2.gender= 'F';
		baby2.hairColor= "Yellow";
		baby2.weaight=7;
		
		baby2.cry();
		baby2.talk(7);
	}

}
