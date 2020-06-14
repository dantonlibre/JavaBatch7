package com.syntaxclass4;

public class NestedIf {
	public static void main(String[] args) {
		boolean isMorning = true;
		boolean isSchool = false;
		int time =20;
		
		if (isMorning) {
			System.out.println("Good mprning!");
		    if(isSchool) {
		    	System.out.println("Friends");
		    }else {
		    	System.out.println("Family");
		    }
		    System.out.println("Bye");
		}else {
			if (time <18) {
				System.out.println("Good afternoon");
			}else {
			System.out.println("Good evening");
		}
		}
		System.out.println("Viktoria has no questions");
		
		
		}
	}


