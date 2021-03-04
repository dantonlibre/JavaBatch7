package com.syntax.class28;
public class TestShape {
	
	public static void main(String[] args) {
		
		Shape circle =new Circle();
		circle.calculateArea();
		circle.calculatePerimiter();
		
		Shape square =new Square();
		square.calculateArea();
  	    square.calculatePerimiter();
	}
}

