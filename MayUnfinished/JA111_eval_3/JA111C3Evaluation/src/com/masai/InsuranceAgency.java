package com.masai;

import java.util.Scanner;

public class InsuranceAgency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no.of employees:");
		int n = sc.nextInt();
		if(n < 2)System.out.println("Please enter a valid employee count");
		else {
			System.out.println("Enter the age for "+n+" employees:");
			int age[] = new int[n];
			for(int i = 0 ; i < n; i ++) {
				age[i] = sc.nextInt();
			}
			System.out.println("The average age is " + calculateAverage(age));
		}
		
	}
	public static double calculateAverage(int[] age) {
		double sum = 0;
		for(int i = 0 ; i < age.length; i ++) {
			sum += age[i];
		}
		return sum/age.length;
	}

}
