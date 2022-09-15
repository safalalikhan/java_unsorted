package com.masai;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Demo {

	public static void main(String args[]) throws InvalidAge {
		Scanner sc = new Scanner(System.in);
		System.out.println("enterDOB in dd mm yyyy format");
		String dob = sc.next();
		sc.close();
	
		LocalDate given = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		LocalDate today = LocalDate.now();
	
		if(given.compareTo(today) <= 0) {
			System.out.println("Valid Date");
			}
		else {
		InvalidAge e = new InvalidAge("Date is in the Future");
		throw e;
		}
		
		
	// Question2;
		
		
		}
	public double EmployeeBonus(LocalDate d) throws InvalidAge {
		LocalDate joining = d;
		LocalDate today = LocalDate.now();
		if(joining.compareTo(today) > 0) {
			InvalidAge e = new InvalidAge("Date in FUture");
			throw e;	
		}
		else {
			int p = Period.between(joining,today).getYears();
			if(p >= 2)return 10000;
			else if ( p > 1) return 8000;
			else return 5000;
		}

		
	}
		
}
