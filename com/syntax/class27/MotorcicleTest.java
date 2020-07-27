package com.syntax.class27;

public class MotorcicleTest {

public static void main(String[] args) {
		
		//new Drivable();CE: cannot instantiate
		
		//new Motorcycle();CE: cannot instantiate
		
		System.out.println(" ------ Object of Motorcycle type ----- ");
		Drivable m=new Bike();
		m.driving();
		m.breaking();
		
		System.out.println(" ------ Object of Drivable type ----- ");
		
		Drivable d=new Bike();
		d.driving();
		d.breaking();

	}
}
