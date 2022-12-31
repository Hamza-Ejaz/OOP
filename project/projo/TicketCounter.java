package projo;

public class TicketCounter {
	private int availableSeats = 100;
	boolean s = true;

	public void bookTicket(String pname, int numberOfSeats) {
		if ((availableSeats >= numberOfSeats) && (numberOfSeats > 0)) {
			System.out.println("Hi, " + pname + " : " + numberOfSeats + " Seats booked successfully");
			availableSeats = availableSeats - numberOfSeats;
		} else {
			System.out.println("Hi, " + pname + " : Seats not Available");
			s = false;
		}
	}

	public boolean check() {
		return s;
	}
}
