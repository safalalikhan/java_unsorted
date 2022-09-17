package com.masai;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Bank");
		String input = sc.next();
		
		Bank bank = getBank(input);
		if(bank != null) {
			if(bank instanceof AxisBank) {
				AxisBank axis = (AxisBank)bank;
				axis.displayDetails();
				axis.getCreditCard();
				
			}
			if(bank instanceof ICICIBank) {
				ICICIBank icici = (ICICIBank)bank;
				icici.displayDetails();
			}
			
		}
		else {
			System.out.println("Enter a valid bank name");
		}
		sc.close();	
		
		
	}

	
	public static Bank getBank(String bank) {
		if(bank.equalsIgnoreCase("axis")) {
			AxisBank axis = new AxisBank();
			axis.setDetails();
			return axis;
		}
		else if(bank.equalsIgnoreCase("icici")) {
			ICICIBank icici = new ICICIBank();
			icici.setDetails();
			return icici;
		}
		else return null;
		
		
	}

}
