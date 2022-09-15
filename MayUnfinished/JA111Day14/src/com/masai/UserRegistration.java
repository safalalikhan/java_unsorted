package com.masai;

public class UserRegistration {
	String name;
	String country;
	
	public UserRegistration (String n,String c) {
		if(c == "India") {
			this.country = c;
					
		}
		else {
			InsufficientFundsException e = new InsufficientFundsException("User Outside India");
			throw e;
		}
	
}
}
