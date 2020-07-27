package com.syntax.class28;
public class Registration {

//	Create Registration Class in which you would have variables as email, userName and password that have an access scope only within its own class. After creating an object of the class user should be able to call methods and in each method separately pass values to set users email, username and password. 
//	Requirements: 
//	Valid email consider to be only yahoo
//	Valid userName and password cannot be empty and should be of length larger than 6 characters. Also valid password cannot contain userName.
	private String email, userName, password;
	
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String emeil) {
	  if (email.equalsIgnoreCase("yahoo")){	
	     this.email=email;
	     System.out.println(this.email);
	  }else {System.err.println("Wrong email");}
	}
	public void setname(String userName) {
		  if (userName.length()>6){//&&(!(password){	
		     this.userName=userName;
		     System.out.println(this.userName);
		  }else {System.err.println("Wrong User Name");}
		  }
		  public void setpass(String password) {
			  if (password.length()>6 && (!(password.equalsIgnoreCase(userName)))){	
				     this.password=password;
				     System.out.println(this.password);
				  }else {
					  System.err.println("Wrong password");
				  }
		  }}
	
	
	
	
	

