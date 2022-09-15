package com.masaij13;

import java.util.Scanner;

public class Demo {

	class Main {
		public static void main(String args[]) {
		System.out.println("start of main..");
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter num1");
			int num1 = sc.nextInt();
			System.out.println("Enter num2");
			int num2 = sc.nextInt();	
			String message = null;
			sc.close();
			int num3 = num1 / num2;	
			if(num3 > 10){
				message = "Welcome to Exception Handling ";
				}	
			System.out.println("Message is :"+message.toUpperCase());

		}catch(ClassCastException e)
		{
			System.out.println("Input should be Number");
			}
			catch(ArithmeticException e)
			{
			System.out.println("num2 cannot be zero");
			}
			catch(NullPointerException e)
			{
			System.out.println("String cannot be null");
			}
		
		
		System.out.println("end of main");
	
		
}
}
