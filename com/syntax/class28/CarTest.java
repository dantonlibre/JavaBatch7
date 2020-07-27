package com.syntax.class28;

public class CarTest {

	public static void main(String[] args) {
		
		Car car = new Car(40000.0, "grey", 25);
		System.out.println(car.calculateSalePrice());
		
		Car sedan= new Sedan(500000.0, "grey", 25);
		System.out.println("sedan's price is " + sedan.calculateSalePrice());
		
		Car truck = new Truck(800000.0, "white", 2500);
		System.out.println("truck price is" + truck.calculateSalePrice());	
	}
	
	
}
