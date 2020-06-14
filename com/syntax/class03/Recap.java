package com.syntax.class03;

public class Recap {
    
	 public static void main(String[] args) {
		
		 int num = 10+10*10;
		 System.out.println(num);
		 
		 
		 int num2 = (10+10)*10;
		 System.out.println(num2);
		 
		 int num3 = 10 *10 +10 /10;
		 System.out.println(num3);
		 
		 System.out.println("*****************");
		 int a = 10;
		 int b =20;
		 
		 String x ="Java";
		 String y = "Synday";
		 System.out.println( a + b + x + y);//30JavaSynday
		 System.out.println(a + x + y + b);  //10JavaSynday20
		 System.out.println(x + y + a + b);// JavaSunday1020
		 System.out.println(x + y + (a + b));//JavaSunday30
		 
		 
		 //If i want 1020JavaSunday
		 System.out.println(a + "" + b + x + y);
		 System.out.println(a +  (b + x + y));
		 System.out.println("" + a + b + x + y);
		 
		 
	}
}
