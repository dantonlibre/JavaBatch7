package com.syntax.class30;
abstract class Parent{
	
		  
	public abstract void m1(int a); 
	public abstract void m1(double a); 
	public void oper(){ 
		System.out.println("m1 without parameters"); 
		System.out.println("m1 method with parameter");
	} 
	 public static void main(String[] args) {

		
		Main obj=new Main();
		 obj.oper();
		
		
 }
 }
