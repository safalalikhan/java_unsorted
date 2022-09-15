package com.masai;

public class threadClass extends Thread{
	int product = 1;

	@Override
	public void run(){
	for(int i=1;i<=10;i++){
	product *= i;
	}
	}


}
