package com.syntax.class17;

import java.util.Scanner;

public class Reverse {

	 public static void main(String[] args) {
		    Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String s = inp.nextLine();
           for(int i = s.length() - 1;i >=0;i--) {
        	   char letters = s.charAt(i);
        	   System.out.print(letters);
           }
	    
	 }}