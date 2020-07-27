package com.syntax.class27;

public class Parent {


		  Parent(){
			 System.out.println("This is Parent constructor");
		  }}
class Child extends Parent{
	  Child(){
	  super();
	}}
class Main {
	  public static void main(String[] args) {
	   Child obj = new Child();
	}}