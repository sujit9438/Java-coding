package railwayreservation;

public class Passenger implements Runnable
{
	public String passengerName;
	public int requestedSeats;
	public Train train;
	public Passenger(String passengerName, int requestedSeats, Train train) 
	{	
		this.passengerName = passengerName;
		this.requestedSeats = requestedSeats;
		this.train = train;
	}
	public void run()
	{
		try
		{
			train.bookSeats(requestedSeats);
		}
		catch(InsufficientSeatsException e)
		{
			System.out.println(passengerName + ": " + e.getMessage());
		}
	}
	
}
