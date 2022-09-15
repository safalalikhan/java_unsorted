package com.masai;

public class AccountDemo {
	public static void main(String[] args) {
		Account a1 = new Account("12345");
		try {
			System.out.println("balance " +a1.balance);
			a1.deposit(500);
			System.out.println("balance " +a1.balance);
			a1.withdraw(100);
			System.out.println("balance " +a1.balance);
			a1.withdraw(1000);
			System.out.println("balance " +a1.balance);
		}catch(InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}


	}

}
