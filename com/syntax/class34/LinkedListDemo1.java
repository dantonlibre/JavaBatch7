package com.syntax.class34;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {
	public static void main(String[] args) {

		ArrayList<Boolean> A = new ArrayList<>();
		A.add(true);
		A.add(false);
		A.add(false);
		ArrayList<Boolean> B = new ArrayList<>();
	    B.add(true);
		B.add(false);
		B.add(false);
	
		 Iterator iter = B.iterator();  
		 while (iter.hasNext()) {  
			 System.out.println(iter.next());      
	}}}
   

