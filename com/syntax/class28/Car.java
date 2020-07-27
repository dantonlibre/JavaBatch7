package com.syntax.class28;
public class Car {
	double carPrice;
	String color;
	double discount;	
	Car(double carPrice, String color, double discount){
		this.carPrice=carPrice;
		this.color=color;
		this.discount=discount;
	}
	public double calculateSalePrice() {
		return carPrice * discount;
	}	
}
class Sedan extends Car{
	int length;	
	Sedan(double carPrice, String color, int length){
		super(carPrice, color, length);
			this.length=length;
		}
	public double calculateSalePrice() {
		if(length>20) {
			return carPrice * 0.05;		
		}
		else {
			return carPrice*0.1;
		}
	}}
class Truck extends Car{
	int weigth;	
	Truck(double carPrice, String color, int length){
		super(carPrice, color, length);
			this.weigth=weigth;
		}
	public double calculateSalePrice() {
		if(weigth>2000) {
			return carPrice * 0.1;		
		}
		else {
			return carPrice*0.2;
		}}}