package com.syntax.class34;
 class Main implements ParentInterface  {
	public void parentMethod() {
		System.out.println("Parent Method-welcome to Syntax");	
	}
	public void childMethod() {
		System.out.println("Child Method-hello Syntax");
	}
     public static void main(String[] args) {
	
    	 Main a = new Main();
    	 a.parentMethod();
	     a.childMethod();
     }}

	

