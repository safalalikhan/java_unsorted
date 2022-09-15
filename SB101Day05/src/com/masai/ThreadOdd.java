package com.masai;

public class ThreadOdd implements Runnable{

	@Override
	public void run() {

		System.out.println("inside " + Thread.currentThread().getName());
		for(int i = 1; i <= 20 ; i ++) {
			if(i % 2 == 1)System.out.println(i);
		}
	}
	

}
