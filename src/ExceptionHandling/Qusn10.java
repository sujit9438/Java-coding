package ExceptionHandling;

import java.util.Scanner;

public class Qusn10 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        int id=sc.nextInt();
        Passenger a= new Passenger();
        try
        {
            a.TicketCancel(id);
        }
        catch(TicketAlreadyCancelledException e)
        {
            System.out.println(e.getMessage());
        }
	}

}
class Passenger
{
    public void TicketCancel(int id)throws TicketAlreadyCancelledException
    {
        if(id==101)
        {
            throw new TicketAlreadyCancelledException("TicketAlreadyCancelledException: Ticket 101 already cancelled");
        }
        else
        {
            System.out.println("Ticket cancelled successfully");
        }
    }
}
class TicketAlreadyCancelledException extends Exception 
{
    public TicketAlreadyCancelledException(String message)
    {
        super(message);
    }
}