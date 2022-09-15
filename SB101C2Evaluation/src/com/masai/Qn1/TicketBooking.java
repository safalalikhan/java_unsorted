package com.masai.Qn1;

public class TicketBooking extends Thread{
	TicketCounter ticketCounter;
	String passengerName;
	int noOfSeatsToBook;
	
	public TicketBooking(TicketCounter tc, String name, int seats) {
		this.ticketCounter = tc;
		this.passengerName = name;
		this.noOfSeatsToBook = seats;
	}
	
	
	@Override
	public  void run() {
		try {
			this.ticketCounter.bookSeat(passengerName, noOfSeatsToBook);			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
	

}
