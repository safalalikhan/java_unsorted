package com.masai;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class MainQn02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDate today = LocalDate.now();
		System.out.println("Enter Date of birth in dd-MM-yyyy format");
		String date = sc.next();
		
		try {
			DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate dob = LocalDate.parse(date,format);
			
			if(dob.isAfter(today)) {
				InvalidAgeException iae = new InvalidAgeException();
				throw iae;
			}
			
			float age = ChronoUnit.YEARS.between(dob,today);
//			System.out.println(age);
			
			if(age >= 18) {
				Boolean bdayCheck =dob.format(DateTimeFormatter.ofPattern("dd-MM")).equals(today.format(DateTimeFormatter.ofPattern("dd-MM")));
				
				if(bdayCheck) {
					System.out.println("Happy Birthday, You are eligible to cast your vote");
				}
				else {
					System.out.println("You are eligible to cast your vote");
				}
			}
			else {
				System.out.println("You are NOT eligible to cast your vote");
			}
			
			
			
		}catch (DateTimeParseException dtpe) {
			System.out.println("please pass the date in the proper format");
		}catch (InvalidAgeException iae) {
			System.out.println("Date of birth should not be in future");	
		}finally {
			sc.close();
		}

	}

}
