package com.masai;

public class OLA {

	
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		Car c1;
		Sedan s1 = null ;
		Hatchback h1 = null;
		
		if(numberOfPassenger > 3) {
			c1 = s1;
		}
		else {
			c1 = h1;
		}
		
		return c1;
	}
	public int calculateBill(Car car) {
		return 0;
		
	}
}
