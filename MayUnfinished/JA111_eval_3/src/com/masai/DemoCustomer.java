package com.masai;

import java.util.Scanner;

public class DemoCustomer {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Customer username :");
		 String n = sc.nextLine();
		 System.out.println("Enter the Customer password");
		 String p = sc.nextLine();
		 System.out.println("Enter the Customer mobile");
		 String m = sc.nextLine();
		 System.out.println("Enter the Customer email :");
		 String e = sc.nextLine();
		 

		 Customer c1 = new Customer(n,p,m,e);
//		 c1.getDetails();
		 sc.close();	
	}

}
