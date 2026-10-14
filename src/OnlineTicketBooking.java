
public class OnlineTicketBooking {

	public static void main(String[] args) throws InterruptedException 
	{
		TicketBooking tb= new  TicketBooking();
		Customer t1= new Customer("Customer A", 2, tb);
		t1.setName("Customer A");
		Customer t2= new Customer("Customer B", 2, tb);
		t2.setName("Coustomer B");
		Customer t3= new Customer("Customer B", 3, tb);
		t3.setName("Coustomer C");
		t1.start();t2.start();t3.start();
		t1.join();
		t2.join();
		t3.join();
		System.out.println("Ticket Remaining :"+tb.availableTicket);
		
	}

}
class TicketBooking
{
	public int availableTicket=5;
	
	public synchronized void bookTicket(int numberOfTicket)
	{
		if(numberOfTicket <=availableTicket)
		{
			availableTicket-=numberOfTicket;
			System.out.println(Thread.currentThread().getName()+" Booked "+ numberOfTicket+" ticket Sucessfully");
		}
		else
		{
			System.out.println("Booking failed for "+Thread.currentThread().getName()+" : not enough titcket available");
		}
	}
}
class Customer extends Thread
{
	public String name;
	public int numberOfTicket;
	public TicketBooking tb;
	public Customer(String name, int numberOfTicket, TicketBooking tb) 
	{
		this.name = name;
		this.numberOfTicket = numberOfTicket;
		this.tb = tb;
	}
	public void run()
	{
		tb.bookTicket(numberOfTicket);
	}
	
}

