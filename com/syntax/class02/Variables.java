package com.syntax.class02;

public class Variables {
    
	public static void main(String[] args) {
		
		
		System.out.println("----------------------");
		//b)
		//Change students's city, state, phone number and grade. And print those
		
		// Not possible
		//String city = "Garfield";
		
		//Not good, becouse you're not re-assigning
		//String city2 = "Garfield";
		
		String city;
		String state;
		String phoneNumber2;
		String grade;
		String myNameIs = "Vladyslav";
		String mylastName = "Yankevych";
		
		
		
		
		city = "Garfield";
		state = "NJ";
		phoneNumber2 = "3477561716";
		grade = "A+";
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber2);
		System.out.println(grade);

		System.out.println("***************");
        //Task:
		//1.My name is_and my last name is _.
		//2 I live in city of _state_and my phone number is_!
		
		System.out.println("MY name is" + myNameIs + "and my last name is" + mylastName + '.');
		System.out.println("I live in city of " + city + "state" + state + "and my phone number is" + phoneNumber2 +'.'  );
		
		
		
		
	}
}
