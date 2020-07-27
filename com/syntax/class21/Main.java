package com.syntax.class21;

public class Main {
	 int intValue;
	  double doubleValue;
	  char charValue;
	   public static void main(String[] args){
	    Main obj1 = new Main();
	    Main obj2 = new Main();
	    obj1.intValue = 10;
	    obj1.doubleValue = 10.23;
	    obj1.charValue = 'a';
	    System.out.println(obj1.intValue + "\n" + obj1.doubleValue + "\n" + obj1.charValue);
	    obj2.intValue = 100;
	    obj2.doubleValue = 100.23;
	    obj2.charValue = 's';
	    System.out.println(obj2.intValue + "\n" + obj2.doubleValue + "\n" + obj2.charValue);
	  }
	}