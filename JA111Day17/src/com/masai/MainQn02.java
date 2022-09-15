package com.masai;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class MainQn02 {
	public static void main(String[] args) throws InvalidAgeException{
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		try {
			System.out.println("Enter DOB in dd-MM-yyyy pattern");
			String bday = sc.next();
			LocalDate dob = LocalDate.parse(bday, format);
			LocalDate today = LocalDate.now();

			if(dob.isAfter(today)) {
				System.out.println("Date of Birth should be smaller than End date");
			}
			else {
				long age = ChronoUnit.YEARS.between(dob, today);
				System.out.println("AGE is " + age);
			}
		}catch(DateTimeParseException e) {
			System.out.println("Please enter date in dd-MM-yyyy format");
		}
		sc.close();
	}
}