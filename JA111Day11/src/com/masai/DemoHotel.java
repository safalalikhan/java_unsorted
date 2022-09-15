package com.masai;

import java.util.Scanner;

public class DemoHotel {

	public static Hotel provideFood(int amount) {
		if(amount >= 1000) {
			return new TajHotel();
		}
		else if(amount >= 200) {
			return new RoadSideHotel();
		}
		else {
			System.out.println("Please enter a valid amount");
			return null;
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount you have :");
		int amount = sc.nextInt();
		Hotel h = provideFood(amount);
		if(h instanceof TajHotel) {
			((TajHotel) h).welcomeDrink();
			h.chickenBiryani();
			h.masalaDosa();
			
		}
		if(h instanceof RoadSideHotel) {
			h.chickenBiryani();
			h.masalaDosa();
		}
	}
	
}
