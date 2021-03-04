package com.syntax.class27;

public class TrustableTest {
public static void main(String[] args) {

	Bank b = new BOA();
	b.deposit();
	b.trust();
	b.withdraw();
	System.out.println("---------------");
	Trustable t = new BOA();
	t.trust();
	System.out.println("---------------");
	Bank p = new PNC();
	p.deposit();
	p.trust();
	p.withdraw();
	System.out.println("---------------");
	Mortgage m = new PNC();
	m.giveMortgage();
	System.out.println("---------------");
	Investments i = new PNC();
	i.doInvestments();
	System.out.println("---------------");
	Trustable pnc = new PNC();
	pnc.trust();
}}
	
	