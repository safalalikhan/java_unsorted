package com.masai;

public class Account {
	String accountNumber;
	double balance;
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) throws InsufficientFundsException{
		if(amount <= this.balance) {
			this.balance -= amount;
		}
		else {
			InsufficientFundsException ife = new InsufficientFundsException("Balance is low, please deposit some amount !");
			throw ife;
		}
	}
	
	public Account(String accNum) {
		this.accountNumber = accNum;
		this.balance = 0;
	}
	

}
