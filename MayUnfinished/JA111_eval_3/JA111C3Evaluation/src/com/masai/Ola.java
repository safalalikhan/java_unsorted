package com.masai;

public class Ola {

	public Ola() {
		// TODO Auto-generated constructor stub
	}
	public Car bookCar(int numberOfPassengers, int numberOfKMs) {
		if(numberOfPassengers <= 3 ) {
			return new HatchBack(numberOfPassengers,numberOfKMs);
		}
		else {
			return new Sedan(numberOfPassengers,numberOfKMs);
		}

		
	}
	public int calculateBill(Car car) {
		int bill;
		if(car instanceof Sedan) {
			Sedan s = (Sedan)car;
			bill = s.getNoOfKms()* s.farePerKm;
		}
		else {
			HatchBack h = (HatchBack)car;
			bill = h.getNoOfKms() * h.farePerKm;
		}
		return bill;
	}

}
