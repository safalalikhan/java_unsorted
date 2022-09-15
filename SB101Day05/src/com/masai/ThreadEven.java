package com.masai;

public class ThreadEven implements Runnable{

	@Override
	public void run() {

		System.out.println("inside " + Thread.currentThread().getName());
		for(int i = 1; i <= 20 ; i ++) {
			
			if(i % 2 == 0)System.out.println(i);
		}
	}
	

}
