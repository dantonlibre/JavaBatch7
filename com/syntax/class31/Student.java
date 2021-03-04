package com.syntax.class31;
public class Student {
	public int id;
	public String name;
	
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public void print() {
		System.out.println(this.name + " has student id "+this.id);
	}
	
}
