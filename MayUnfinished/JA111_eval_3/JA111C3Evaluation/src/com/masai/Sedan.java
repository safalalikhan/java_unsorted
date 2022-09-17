package com.masai;

public class Sedan extends Car{
	final int farePerKm =20;

	public Sedan() {
	
	}
	public Sedan(int p, int k){
		super.setNumberOfPassengers(p);
		super.setNoOfKms(k);
	}
}
