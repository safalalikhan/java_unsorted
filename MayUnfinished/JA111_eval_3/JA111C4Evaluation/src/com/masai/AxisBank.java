package com.masai;

import java.util.Scanner;

public class AxisBank extends Bank{
	double rateOfInterest;

@Override
public void displayDetails() {
	super.displayDetails();
	System.out.println("Rate of Interest :" + this.rateOfInterest);
}	
void getCreditCard() {
	System.out.println("Get the Credit Card from the Axis bank");
}
void setDetails() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Branch");
	super.branchName = sc.next();
	System.out.println("Enter IFSC");
	super.ifscCode = sc.next();
	System.out.println("Enter Interest Rate");
	this.rateOfInterest = sc.nextDouble();
	sc.close();	
}

}
