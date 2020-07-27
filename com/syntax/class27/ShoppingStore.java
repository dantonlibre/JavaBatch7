package com.syntax.class27;

public class ShoppingStore {
 String item;
 double price; 
 int quantity; 
 public ShoppingStore(double price,  int quantity) {
	this.price=price;
	this.quantity=quantity;
 }
 public double Creation1() {
	 double TotalValue1 = price * quantity;
	 return TotalValue1;
 }
}
