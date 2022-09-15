package com.masai.Qn1;

public class TicketCounter {
	static int availableSeats;
	
	public synchronized void bookSeat (String name, int numberOfSeats) {

			if(numberOfSeats <= availableSeats) {
				availableSeats -= numberOfSeats;
				System.out.println(name +" booked "+numberOfSeats+" seats");
				System.out.println("Remaining seats :" + availableSeats);
			}
			else throw new IllegalArgumentException("Required number of seats Unavailable \nRemaining seats :" + availableSeats);

	}
	public void checkAvailability (){
		
		System.out.println("Available seats right now is : "+ availableSeats);
		}
	
	

}
