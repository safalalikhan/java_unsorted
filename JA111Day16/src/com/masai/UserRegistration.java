package com.masai;

import java.util.Scanner;

public class UserRegistration {
	
	public static void registerUser(String name, String country) throws InvalidCountryException{
		if(country.equalsIgnoreCase("India")) {
			System.out.println("User registration done successfully");
		}
		else {
			InvalidCountryException ice = new InvalidCountryException("User Outside India cannot be registered");
			throw ice;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter User Name :");
		String name = sc.next();
		System.out.println("Enter the Country :");
		String country = sc.next();
		try {
			registerUser(name, country);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

		sc.close();
		
		
		
	}

}
