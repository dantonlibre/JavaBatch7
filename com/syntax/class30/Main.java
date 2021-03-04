package com.syntax.class30;

import com.syntax.class23.MethodOverloading;

public class Main{

	 final void calc(int a){ 
			System.out.println("final int");
		} 	  
		 final void calc(boolean c) {
			System.out.println("Final method with boolean parameter");
		 }
       final void calc(double b) {
	 System.out.println("final double");
 }
       final void calc(String name) {
			System.out.println("Final method with String parameter");
       }
 public static void main(String[] args) {
		
		Main obj=new Main();
		obj.calc(false);
		obj.calc(null);
		
 }
public void oper() {
	// TODO Auto-generated method stub
	
}
}

	 
	 
 