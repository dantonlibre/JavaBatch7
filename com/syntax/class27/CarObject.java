package com.syntax.class27;

public class CarObject {
	String model;
	double price; 
	int quantity;
	public CarObject(String model, double price, int quantity){
		this.model=model;
		this.price=price;
		this.quantity=quantity;
	}
	void carStockValue(){
		double stockValue;
		stockValue = price * quantity;
		System.out.println(model + " Stack Value "+ stockValue);	
	}}
