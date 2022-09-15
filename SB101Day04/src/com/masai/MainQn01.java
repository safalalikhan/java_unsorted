package com.masai;

public class MainQn01 {
	public static void main(String[] args) {
		threadClass t1 = new threadClass();
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			System.out.println("Unexpected error in thread");
		}
		System.out.println("Product :"+ t1.product);
		
	}

}
