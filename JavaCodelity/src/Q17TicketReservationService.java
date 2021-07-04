
public class Q17TicketReservationService {

	private int totalTickets;
	public Q17TicketReservationService(int totalTickets)
	{
		this.totalTickets=totalTickets;
	}
	
	public synchronized int reserveTickets(int n)
	{
		if(totalTickets>=n)
		{
			totalTickets = totalTickets-n;
			return totalTickets;
		}
		else
		{
			throw new RuntimeException("The available seats are less than the requested seats");
		}
	}
}
