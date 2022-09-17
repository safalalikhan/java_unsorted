package com.masai;

public class Bank {
	String branchName,ifscCode;
	public void displayDetails() {
		System.out.println("Branch :" + this.branchName);
		System.out.println("IFSC :" + this.ifscCode);
	}

}
