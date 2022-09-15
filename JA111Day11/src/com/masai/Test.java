package com.masai;

import java.util.Scanner;

public class Test implements Intr {

	@Override
	public int[] display(int p) {
		// TODO Auto-generated method stub
		int[] arr = new int[p];
		arr[0] = 2;
		int i = 1;
		for(int j = 3 ; j <= p ; j++) {
			if(isPrime(j)) {
				arr[i] = j;
				i++;
			}
		}
		
		return arr;
	}
	public boolean isPrime(int n) {
		int factors = 0;
		for(int i = 2 ; i <= n/2 ; i++) {
			if(n % i == 0) {
				factors++;
				break;
			}
			
		}

		if(factors > 0)return false;
		else return true;
	}
	
	public static void main(String[] args) {
		Test t=new Test();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the input");
		int input = sc.nextInt();
		if(input < 2) {
			System.out.println("Enter valid number");
		}
		else {
			int[] arr= t.display(input);
			
			StringBuilder s = new StringBuilder();
			
			for(int i = 0; i < arr.length && arr[i]!= 0; i++) {
				s.append(arr[i]);
				s.append(" ");
			}
			System.out.println(s.toString());			
			
		}
		
		
		

	}

}
