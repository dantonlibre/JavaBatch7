package com.syntax.class13;

public class Main {

	String breed, name, color;
	
	public static void main(String[] args) {

	 Dog dog1=new Dog();
	 dog1.name="Husky";
	 dog1.breed="Dogs";
	 dog1.color="White";
	 
	 dog1.bark();
	 dog1.run();
	 dog1.play();

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

}
