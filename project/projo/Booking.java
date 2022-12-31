package projo;

public class Booking {
	private TicketCounter ticketcounter;
	private String pname;
	private int bookedseats;

	public Booking(TicketCounter ticketcounter, String pname, int bookedseats) {
		this.ticketcounter = ticketcounter;
		this.pname = pname;
		this.bookedseats = bookedseats;
	}

	public void run() {
		ticketcounter.bookTicket(pname, bookedseats);
	}
}
