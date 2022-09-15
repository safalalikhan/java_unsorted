package com.masai;

import java.util.Scanner;

public class MainQn01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Joining Date in dd-MM-yyyy pattern");
		String joinDate= sc.next();
		
		EmployeeBonus test = new EmployeeBonus();
		try {
			System.out.println("Bonus : "+ test.calculateBonus(joinDate));
			
			
		}catch(Exception e) {
		System.out.println(e.getMessage());
		}
		sc.close();

	}

}
