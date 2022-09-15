package com.masai.Qn1;

public class CheckTicketAvailability extends Thread{
	TicketCounter ticketCounter;
	public CheckTicketAvailability(TicketCounter tc) {
		this.ticketCounter = tc ;
	}
	@Override
	public  void run() {
			this.ticketCounter.checkAvailability();			
	}	
}
