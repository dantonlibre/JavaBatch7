package com.syntax.class25;

public class Main {

	static void letter(String[] args) {
		
		Main obj = new Main();
		String test =obj.thirdLetter("hello there");
		String test2 = obj.thirdLetter("technology");
		System.out.println(test);
		System.out.println(test2);
		}
		static String thirdLetter(String obj) {
		String s = obj.replaceAll(".(?!$)", "$0 ");
			return s;
		}
			//test case below (dont change):
			public static void main(String[] args){
				System.out.println(thirdLetter("hello there")); //"hltr"
				System.out.println(thirdLetter("technology")); //"thly"
			}
		}
