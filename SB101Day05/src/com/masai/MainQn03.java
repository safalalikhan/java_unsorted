package com.masai;

public class MainQn03 {
	public static void main(String[] args) {

		System.out.println("Inside "+ Thread.currentThread().getName());
		ThreadOdd to = new ThreadOdd();
		ThreadEven te = new ThreadEven();
		
		Thread t1 = new Thread(te);
		Thread t2 = new Thread(to);
		
		System.out.println("Going to start t1");
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			System.out.println("error");
		}
		
		System.out.println("Going to start t2");
		t2.start();
	}
	

}
