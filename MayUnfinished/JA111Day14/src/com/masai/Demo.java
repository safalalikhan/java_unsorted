package com.masai;

public class Demo {
	public void main(String[] args) {
		Account a1 = new Account("00001");
		try {
			a1.deposit(1500);
			a1.withdraw(1000);
			a1.withdraw(1000);	
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			UserRegistration u1 = new UserRegistration("Safal", "India");
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			UserRegistration u2 = new UserRegistration("Nrupul", "USA");
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}


}
