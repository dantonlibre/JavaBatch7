package com.syntax.class24;

import com.syntax.class24.Visa.AX;

public class CreditCardTest {
public static void main(String[] args) {
	
	Visa visa = new Visa(1000);
	double interest = visa.dailyInterest();
	System.out.println(interest);
	
	AX ax = new AX(1000);
	double intr=ax.dailyInterest();
	System.out.println(intr);
	
	
}
}
     