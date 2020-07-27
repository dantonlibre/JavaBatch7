package com.syntax.class27;
public class Dog {
	String name;
	double weight;
	static String breed = "Mutt";
	Dog(String name, double weight){
		this.name=name;
		this.weight=weight;
	}
	void display() {
		System.out.println(name+ " " +breed+ " "+ weight);
	}	
}
