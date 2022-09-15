package com.masai;

public class MainQn02 {
	public static void main(String[] args) {
		
		

		Common c = new Common();
//		Common c1 = new Common();

		//sharing same Common object to two thread
		
		ThreadA t1= new ThreadA(c,"Safal");
		ThreadB t2 =new ThreadB(c,"Amaan");
		
		
		t1.start();
		t2.start();
	}

}
