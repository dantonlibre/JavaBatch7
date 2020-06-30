package com.syntax.class10;

public class Homework {

	public static void main(String[] args) {
		
	
	//print the following patter
	
	
	for(int row=5;row >=1;row--) {
	
	for (int col = row;col >=1;col--) {
		System.out.print(row);
	}
	System.out.println();
   }
	System.out.println("---------------");
    
	
     /////Print the following pattern:
//*
//**
//***
//****
//*****
for(int i=1;i<=5;i++) {
	for(int j=i;j>=1;j--) {
		System.out.print("*");
	}
	System.out.println("");
}}}