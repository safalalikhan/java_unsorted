package com.masai;

public class Car {
	private int numberOfPassengers,noOfKms;

	
	Car(int p, int k){
		this.noOfKms = k;
		this.numberOfPassengers = p;
	}
	Car(){
		this.noOfKms = 0;
		this.numberOfPassengers = 0;
	}
	
	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

	public int getNoOfKms() {
		return noOfKms;
	}

	public void setNoOfKms(int noOfKms) {
		this.noOfKms = noOfKms;
	}

}
