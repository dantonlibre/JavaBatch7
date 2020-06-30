package com.syntax.class13;

public class CarFactory {
	public static void main(String[] args) {
		
	
//	building an object of the car
 Car car1=new Car();
 car1.make="Tesla";
 car1.model="X";
 car1.color="Red";
 car1.year=2020;
 car1.speed=200;
 System.out.println("Make of first car is " + car1.make+ " and model is " 
 + car1.model+" and it is in " + car1.color+ " color");
 
 System.out.println("---Accessing methods from Car class using car1 ---");
 car1.drive();
 car1.reverse();
 car1.transportPeaople();
 
 Car car2=new Car();
 
 car2.make="BMW";
 car2.model="X";
 car2.color="Red";
 car2.year=2020;
 car2.speed=240;
 System.out.println("Make if 2 cars is "+ car2.make);
 
 System.out.println("---Accessing methods from Car class using car2 ---");
 car2.drive();
 car2.reverse();
 car2.transportPeaople();
 
 
 
 
// Car car3=new Car();
// 
// car3.make="Lexus";
// car3.model="RX";
// car3.color="White";
// car3.year=2018;
// car3.speed=260;
// System.out.println("Make of three car is "+ car3.make);
// 
// Car car4=new Car();
// 
// car4.make="Audi";
// car4.model="Q7";
// car4.color="Black";
// car4.year=2019;
// car4.speed=230;
 //System.out.println("Make of four car is "+ car4.make);
 
	}
  }	

