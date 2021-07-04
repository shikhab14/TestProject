/* Implement ticket reservation application using multithreading where it has available seats information. Create 4 threads 
 * to access this data to book tickets and ensure data consistency. Ex available seats = 10 T1 requires 6 seats 
 * T2 requires 3 seats T2 require 4 seats if available seats < seat required proper error message should get printed.
 */
public class Q17TicketReservation extends Thread {

	Q17TicketReservationService ts;
	int seatsRequired;
	public Q17TicketReservation(Q17TicketReservationService ts, int seatsRequired) {
		this.ts=ts;
		this.seatsRequired=seatsRequired;
	}
	
	public void run()
	{
		System.out.println("Thread started: " +this.getName());
		try
		{
			int remainingSeats = ts.reserveTickets(seatsRequired);
			System.out.println("Remaining Seats: " +remainingSeats);
		}
		catch(Exception e)
		{
			System.out.println("Unable to complete the reservation for: "+seatsRequired+ " thread" +this.getName());
		}
		System.out.println("Thread completed: " +this.getName());
	}
	
	public static void main(String[] args) throws InterruptedException {
		Q17TicketReservationService trs = new Q17TicketReservationService(10);
		Q17TicketReservation tr1 = new Q17TicketReservation(trs, 6);
		tr1.start();
		tr1.join();
		Q17TicketReservation tr2 = new Q17TicketReservation(trs, 4);
		tr2.start();
		tr2.join();
		Q17TicketReservation tr3 = new Q17TicketReservation(trs, 3);
		tr3.start();
		tr3.join();
	}
	
	
}
