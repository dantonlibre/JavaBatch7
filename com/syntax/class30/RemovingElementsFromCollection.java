package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class RemovingElementsFromCollection {

	public static void main(String[] args) {
		
		ArrayList<String>cities=new ArrayList<>();
		cities.add("New York");
		cities.add("LA");
		cities.add("LA");
		cities.add("Istanbul");
		cities.add("DC");
		cities.add("Kiev");
		
		System.out.println("orriginal arraylist"+cities);
		//remove cities LA, DC
		for(int i=0; i<cities.size();i++) {
			if(cities.get(i).equals("LA")|| cities.get(i).equals("DC")) {
				cities.remove(i);
			}}
		System.out.println("final arraylist"+cities);
		System.out.println("--Removing Objects from ArrayList using enhanced loop----");
//		for(String city:cities) {
//			if(city.equals("Istanbul")) {
//				cities.remove(city);
//			}}
		System.out.println(cities);
		System.out.println("---Removing Objects from Arraylist using iterator--------");
		cities.add("LA");
		cities.add("LA");
		cities.add("Miami");
		cities.add("Miami");
		cities.add("Miami");
		cities.add("Miami");
		cities.add("Moscow");
		
		System.out.println("----Collection before using iterator+ "+cities);
		
		Iterator<String>citiesIt=cities.iterator();
		while(citiesIt.hasNext()) {
		String ci=citiesIt.next();
			if (ci.equals("LA") || ci.equals("New York")) {
				citiesIt.remove();
			}}
		System.out.println("Arraylist after modifications from Iterator: "+ cities);
		}}
	


