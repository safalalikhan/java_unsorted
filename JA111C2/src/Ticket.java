import java.util.Scanner;

public class Ticket {
    int ticketId = 1;
    int price;
    static int availableTickets;
    public int calculateTicketCost(int noOfTickets){
        if(availableTickets >= noOfTickets){
            availableTickets -= noOfTickets;
            int total = noOfTickets * this.price;
            return total;

        }
        else return-1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("Enter no of bookings:");
        int n = sc.nextInt();
        System.out.println("Enter the available tickets:");
        availableTickets = sc.nextInt();
        System.out.println("===========================================");

        for(int i = 0 ; i < n ; i ++){
        Ticket t = new Ticket();
            System.out.println("Enter the ticketid:");
            t.ticketId = sc.nextInt();
            System.out.println("Enter the price:");
            t.price = sc.nextInt();
            System.out.println("Enter the no of tickets:");
            int noOfTickets = sc.nextInt();
            System.out.println("Available tickets:" + availableTickets);
            System.out.println("Total amount :" + t.calculateTicketCost(noOfTickets));
            System.out.println("Available tickets after booking :" + availableTickets);
            System.out.println("===========================================");

        }


    }
}
