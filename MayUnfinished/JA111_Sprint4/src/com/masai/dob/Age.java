package com.masai.dob;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Age {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enterDOB in dd mm yyyy format");
		String dob = sc.next();
		sc.close();
		try{
		LocalDate bday = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		LocalDate today = LocalDate.now();
		Period age = Period.between(bday,today);
		if(age.getYears() >= 18) {
			if(bday == today) {
				System.out.println("Happy Birthday and You are eligible to vote");
			}
			else System.out.println("You are eligible to vote");
		}
			else
		System.out.println("You are not eligible to Vote");
		}catch (Exception e){
		System.out.println("Invalid Date");
		}
		}
}
