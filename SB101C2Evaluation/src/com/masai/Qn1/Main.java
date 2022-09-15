package com.masai.Qn1;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		TicketCounter counter = new TicketCounter(); // common object
		
		TicketCounter.availableSeats = 3;
		
		TicketBooking tb1 = new TicketBooking(counter, "Safal", 1);
		TicketBooking tb2 = new TicketBooking(counter, "Amal", 1);
		TicketBooking tb3 = new TicketBooking(counter, "Arun", 1);
		
		CheckTicketAvailability cta1 = new CheckTicketAvailability(counter);
		
		cta1.start();

		tb1.start();
//		tb1.join();

		tb2.start();
//		tb2.join();

		tb3.start();
//		tb3.join();

		
		

		
		
		
	}
	

}
