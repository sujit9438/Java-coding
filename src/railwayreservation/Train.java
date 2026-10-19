package railwayreservation;

public class Train 
{
	public int totalSeats=10;
	public int availableSeats=10;
	public synchronized void bookSeats(int requestedSeats)throws InsufficientSeatsException
	{
		if(requestedSeats>availableSeats)
		{
			throw new InsufficientSeatsException("");
		}
		else
		{
			availableSeats-=requestedSeats;
			System.out.println("your requested seat "+requestedSeats+" Successfully booked , remaining seat is : "+availableSeats);
		}
	}
}
