package com.syntax.class01;

public class JavaIQ {
 public static void main(String[] args) {
	

//	int a = 10;
//	int b = 20;
//	a=a+b;
//	b=a-b;
//	a=a-b;  
//	System.out.println(a);
//    System.out.println(b);
// 
    System.out.println("---------------------------------------");
 

String x ="Hello";
String y = "Welcome";
x = x +y;
y=x.substring(0,(x).length()-y.length());
x=x.substring(y.length());
System.out.println(x);
System.out.println(y );

System.out.println("-------------------------------------------");

int given = 10;
boolean isPrime=true;

if (given>1) {
	
	for(int i = 2;i<given;i++) {
		
		if(given%i==0) {
			isPrime=false;
			break;
		}
	}
}else {
	isPrime=false;
}
System.out.println("Given number "+given+" is prime?"+isPrime);

System.out.println("---------------------------------------------");
 

 
//int a, b, c;
//a = 0;
//b = 1;
//
//for (int i = 1; i <=10; i++) {
//	
//	System.out.println(a+" ");
//
//     c=a+b;
//     a=b;
//     b=c;

     System.out.println("---------------------------------------");
     
     String str = "Hih9898jhjh%%^$%^ oio ";
     str=str.replaceAll("[A-Za-z]", "");
     int number=str.length();
     System.out.println("Number of alpha character = "+number);
     
     String myString = ("Today is Wednesday and it is Java Class");
     String[]array=myString.split(" ");
     int words=array.length;
     System.out.println("Total words in string:"+myString+"="+words);
 
     System.out.println("-----------------------------------------");
     
     String a = "Hello John";
     
     StringBuffer sb=new StringBuffer(a);
     System.out.println(sb.reverse());
     
     String toReverse="Hello World";
     
     String reversed="";
     for(int i =toReverse.length()-1; i>=0;i--) {
     
     
     
}} }

















