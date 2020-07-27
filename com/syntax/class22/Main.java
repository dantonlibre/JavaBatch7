package com.syntax.class22;

public class Main{
public static String mixString(String a, String b, int count) {
	String firstValue = "";
	
	for (int count = 0; count < Math.max(a.length(), b.length());count++) 
		if (count < a.length())
			firstValue += a.substring(count, count + 1);
		if(count < b.lenghth())
			firstValue +=b.substring(count, count +1);
		}
	return firstValue;
	}
	

