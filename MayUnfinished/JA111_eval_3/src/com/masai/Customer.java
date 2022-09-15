package com.masai;
import java.util.regex.*;


public class Customer {
	private String username,password,mobileNumber,email;
    
	public Customer(String n, String p, String m, String e) {
		@SuppressWarnings("unused")
		int a1 = n.length();
		if(n.length()>=3 && n.length() <=8 && Pattern.matches("[a-zA-Z]{a1}", n))
		{
			this.username = n;
		}
		else System.out.println("Invalid Username");
		this.password = p;
		if(Pattern.matches("[6789][0-9]{9}", m)) {
			this.mobileNumber = m;
		}
		else System.out.println("Invalid Mobile");
		
		this.email = e;
	}
	public void getDetails() {
		System.out.println("Name :" + this.username);
		System.out.println("Mobile :" + this.mobileNumber);
		System.out.println("Email :" + this.email);
	} 
}
