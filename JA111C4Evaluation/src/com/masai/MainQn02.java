package com.masai;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainQn02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		
		try {
			int n = sc.nextInt();
			int[] arr = new int[n];
			
			System.out.println("Enter the elements in the array");
			for(int i = 0 ; i < n ; i ++) {
				arr[i] = sc.nextInt();
			}
			
			System.out.println("Enter the index of the array element you want to access");
			String x = sc.next();
			int y = Integer.parseInt(x);
			System.out.println(arr[y]);
			
			
		}catch(NumberFormatException nfe) {
			System.out.println("java.lang.NumberFormatException");
		}catch(ArrayIndexOutOfBoundsException aiob) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}catch(InputMismatchException ime) {
			System.out.println("java.util.InputMismatchException");
		}
		

		
	sc.close();	
	}

}
