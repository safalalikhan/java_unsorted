package com.masai;

public class Bank {
	private Bank(){
		System.out. println("Inside private constructor of Bank");
		}
	public static Bank getNewBank() {
		Bank b = new Bank();
		return b;
	}

}
