package com.masai;

import java.util.Scanner;

public class Demo {
 public static void main(String[] args) {
	int n,index;
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter the elements in the array");
		try {
			for( int i = 0; i < n; i ++) {
				int num =  sc.nextInt();
				arr[i] = num;
			}
			System.out.println("Enter the index of the array element you want to access");
			index = sc.nextInt();
			System.out.println("The array element at index" + index + " "+ arr[index]);	
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		catch(NumberFormatException e) {
			System.out.println("java.lang.NumberFormatException");
		}
	sc.close();
 }

}
