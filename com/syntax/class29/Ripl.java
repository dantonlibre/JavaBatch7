package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
//null
//Sohil
//Diego
//Alijon
//Asel
//Sumair
//null
//Sohil
//Diego
//Alijon
//Asel
//Sumair

public class Ripl {
	public static void main(String[] args) {
		
		LinkedHashSet<String> arrlist = new LinkedHashSet<>();
	      arrlist.add("null");
	      arrlist.add("Sohil");
	      arrlist.add("Diego");
	      arrlist.add("Alijon");
	      arrlist.add("Asel");
	      arrlist.add("Sumair");
	      for(String element: arrlist) 
	    	    System.out.println(element);
	      Iterator iter = arrlist.iterator();    
	      while (iter.hasNext()) {       
	    	  System.out.println(iter.next());
	      }}}