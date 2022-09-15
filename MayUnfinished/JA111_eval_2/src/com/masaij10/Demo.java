/*
 * Abstract class may or may not have abstract methods inside and the access modifier is default, 
 * but an interface will have only abstract methods inside them and the access modifier is public
 */

package com.masaij10;

import java.util.Scanner;

public class Demo {
	Scanner bag1 = new Scanner(System.in);
	int amount = 0;
	public void main(String[] args) {
		System.out.println("Enter amount ?");
		amount = bag1.nextInt();
		provideFood(amount);
		
	}
	public Hotel provideFood(int amount) {
		if(amount > 1000) {
			TajHotel h1 = new TajHotel();
			return (Hotel) h1;
			}
		else if(amount >200) {
			RoadSideHotel h2 = new RoadSideHotel();
			return (Hotel) h2;
		}
		return null;
	}
}
