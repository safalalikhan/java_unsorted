package com.masai;

public class MainQn03 {
	public static void main(String[] args) {
	
		threadA t1 = new threadA();
		Thread thread1 = new Thread(t1);
		thread1.start();
		
	}

}
