package com.masai;

import java.util.Scanner;

public class MainQn02 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 numbers :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try {
			System.out.println("The quotient of "+a+"/"+b+" = "+a/b);
			
		}catch(ArithmeticException ae){
			System.out.println("DivideByZeroException caught");

		}finally {
			System.out.println("Inside finally block");
		}
		sc.close();
		
	}

}
