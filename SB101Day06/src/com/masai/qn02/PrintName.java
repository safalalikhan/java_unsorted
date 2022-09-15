package com.masai.qn02;

public class PrintName implements Runnable{
	String name;
	public PrintName(String n) {

		this.name = n;
	}
	public void PrintJob() {
		System.out.println("Welcome " + this.name + " by "+ Thread.currentThread().getName());
		
	}

	@Override
	public void run() {
		this.PrintJob();
	}
	

}
