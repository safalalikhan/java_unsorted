package com.masai.qn02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	public static void main(String[] args){
		PrintName[] jobs={
		new PrintName("Ram"),
		new PrintName("Ravi"),
		new PrintName("Anil"),
		new PrintName("Shiva"),
		new PrintName("Pawan"),
		new PrintName("Suresh")
		};
		ExecutorService service = Executors.newFixedThreadPool(3);
		for(PrintName job:jobs){
		service.submit(job);
		}
		service.shutdown();//to shutdown the executorService.
		}


}
