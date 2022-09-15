package com.masai;

public class HatchBack extends Car{
	final int farePerKm = 15;

	public HatchBack() {
		
	}
	public HatchBack(int p, int k){
		super.setNumberOfPassengers(p);
		super.setNoOfKms(k);
	}


}
