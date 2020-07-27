package com.syntax.class13;

public class Car {
	
	//define car features
		String make;
		String model;
		String color;
		int year;
		int speed;
	    String carColor;
	    int carYear;
		 String carMake1;
		 String carMake;
		
		public static void main(String[] args) {
		//define behavior in a from of methods
			System.out.println("Hello, i am code from main method");
			
		Car c1=new Car();
		c1.make="Toyota";
		c1.model="Camry";
		c1.color="Yellow";
		c1.year=2020;
		c1.speed=180;
		
		c1.drive();
		c1.transportPeaople();
		c1.stop();
		c1.reverse();
		}
		
		void drive() {
			System.out.println( make+" can drive");
		}
			
		void reverse() {
			System.out.println(make+" can reverse");
		}
			
		void transportPeaople() {
			System.out.println(make+" can transport peaple");
		}
		void stop() {
			System.out.println(make+" will stop when press break");
			System.out.println(make+" Car stop ");
		}
		
		
		
		}
	
		
		
		
		
		
		
		
		
	


