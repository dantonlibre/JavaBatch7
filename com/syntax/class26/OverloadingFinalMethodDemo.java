package com.syntax.class26;

public class OverloadingFinalMethodDemo {
public static void main(String[] args) {
	OverloadingFinalMethodDemo obj = new OverloadingFinalMethodDemo();
	obj.addStrings("Hello", "World");
	obj.addstrings("Hello", "World", "Java");	
}
private final String addStrings(String valueOne, String valueTwo) {
	return valueOne+valueTwo;
}
private String addstrings(String valueOne, String valueTwo, String valueThree) {
	return valueOne+valueTwo+valueThree;
}}