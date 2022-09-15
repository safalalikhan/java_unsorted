package com.masai;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class MainQn03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		

		
		try {
			System.out.println("Enter start date in dd-MM-yyyy pattern");
			String start = sc.next();
			LocalDate startdate = LocalDate.parse(start, format);
			System.out.println("Enter end date in dd-MM-yyyy pattern");
			String end = sc.next();
			LocalDate enddate = LocalDate.parse(end, format);
			
			
			if(enddate.isBefore(enddate)) {
				System.out.println("Start date should be smaller than End date");
			}
			else {
				long days = ChronoUnit.DAYS.between(startdate, enddate);
				calculateWage(days);
			}
		}catch(DateTimeParseException e) {
			System.out.println("Please enter date in dd-MM-yyyy format");
		}
		

		sc.close();
	}
	
	public static void calculateWage(long days) {
		long wage = days * 1200;
		System.out.println("Wage during period is " + wage);
	}

}
