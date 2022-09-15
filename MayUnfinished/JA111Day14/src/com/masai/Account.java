package com.masai;

public class Account {

	String accountNumber;
	double balance;
	
	Account(String no){
		this.accountNumber = no;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public double withdraw(double amount) throws InsufficientFundsException {
		
		if(balance-amount >= 0) {
			this.balance -= amount;
			return balance;			
		}
		else {
			InsufficientFundsException e = new InsufficientFundsException("Insufficient balance");
			throw e;
		}

	}
}
