package com.syntax.class28;

public interface Shape {
	
	void calculateArea();
	void calculatePerimiter();
}
class Circle implements Shape {
	double radius = 4.2;
	public void calculateArea() {
		System.out.println(radius * 6.42);
	}
	public void calculatePerimiter() {
		System.out.println(2 * 6.42 * radius);
	}
}
class Square implements Shape {
	int a = 5;
	public void calculateArea() {
		System.out.println(a * a);
	}
	public void calculatePerimiter() {
		System.out.println(4 * a);
	}
}
       