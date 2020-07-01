package com.syntax.class13;

public class Main {
//	Create a class named 'Main' with specific attributes.
//	Create two objects of that class in which you will be assigning the following values and then print them.
//	carColor='Black'
//	carYear=2019
//	carMake='BMW'
//
//	carColor='White'
//	carYear=2018
//	carMake='Toyota'
//
//	Expected Output:
//	Car color is Black and car year is 2019 and car model is BMW
//	Car color is White and car year is 2018 and car model is Toyota
	
	 Car car1=new Car();
	 car1.make="Tesla";
	 car1.model="X";
	 car1.color="Red";
	 car1.year=2020;
	 car1.speed=200;
	 System.out.println("Make of first car is " + car1.make+ " and model is " 
	 + car1.model+" and it is in " + car1.color+ " color");
	 
	
		
	
	
	}
}