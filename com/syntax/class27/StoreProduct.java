package com.syntax.class27;

public class StoreProduct {

	String label;
	double price; 
	String category;
	boolean hasExpiration; 
	int stock; 

	StoreProduct(String label,double price, String category, boolean hasExpiration,int stock){
	this.label=label;
	this.price=price;
	this.category=category;
	this.hasExpiration=hasExpiration;
	this.stock=stock;
	}
	StoreProduct(String label,double price,int stock){
		this.label=label;
		this.price=price;
		category="misc";
		hasExpiration=false;
		this.stock=stock;
	}
	StoreProduct(String label,double price){
		this.label=label;
		this.price=price;
		this.category=category;
		this.hasExpiration=hasExpiration;
		this.stock=0;
	}
	 void display() {
			System.out.println(label+ " " +price + " " +category+ " " +hasExpiration+ " " +stock);
		}}
