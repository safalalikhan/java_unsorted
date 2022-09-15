package com.masaij05;

public class Ticket {
private int ticketId = 0;
private int price= 100;
private static int availableTickets=50; 
public int calculateTicketCost(int nooftickets) {
	if(availableTickets <= nooftickets) {
		setTicketId(getTicketId() + 1);
		return nooftickets*price;
	}
	else return -1;
	
}
public int getTicketId() {
	return ticketId;
}
public void setTicketId(int ticketId) {
	this.ticketId = ticketId;
}

}
