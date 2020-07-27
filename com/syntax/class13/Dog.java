package com.syntax.class13;

public class Dog {

	String name, color, breed;
	  public static void main(String[] args) {
		System.out.println();
	
	 Dog dog=new Dog();
	 dog.name="Husky";
	 dog.breed="Dogs";
	 dog.color="White";
	 
	 dog.bark();
	 dog.run();
	 dog.play();
	 
	 Dog dog2=new Dog();
	 dog2.name="Bulldog";
	 dog2.breed="Dogs";
	 dog2.color="Black";
	 
	 
	 dog2.bark();
	 dog2.run();
	 dog2.play();
	 
	 Dog dog3=new Dog();
	 dog3.name="Labrador";
	 dog3.breed="Dogs";
	 dog3.color="Gray";
	 
	 dog3.bark();
	 dog3.run();
	 dog3.play();
	
	  }
	
	void bark() {
		System.out.println(name + " can bark ");
	}
	
	void run() { 
		System.out.println(name + " can run ");
	}
	void play() {
		System.out.println(name + " can play ");
	}
	

}
