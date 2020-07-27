package com.syntax.class27;
public class Car {
	String make;
	String model;
	int numberOfDoors;
	int topSpeed;
	double price;	
Car(String make, String model, int numberOfDoors, int topSpeed,double price){
		this.make=make;
		this.model =model;
		this.numberOfDoors=numberOfDoors;
		this.topSpeed=topSpeed;
		this.price=price;
	}
Car(String make, String model, int topSpeed, double price){
	    this.make=make;
	    this.model =model;
	    numberOfDoors=4;
	    this.topSpeed=topSpeed;
	    this.price=price;
    }
Car(int numberOfDoors, int topSpeed,double price){
		make="unknown";
        model ="unknown";
	    this.numberOfDoors=numberOfDoors;
	    this.topSpeed=topSpeed;
	    this.price=price;		
}
Car(String make, String model, int numberOfDoors){
	    this.make=make;
	    this.model =model;
	    this.numberOfDoors=numberOfDoors;
	    topSpeed=90;
	    price=0.0;
}
 void display() {
	System.out.println(make+" "+ model+ " " +numberOfDoors+ " " +topSpeed+ " " +price);
}}
