package ObjectClass;

import java.util.Scanner;

public class Qusn1 {

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
	        String seatNumber=sc.nextLine();
	        if(seatNumber.length()<2)
	        {
	            System.out.println("Error: Seat number length must be between 2 and 5");
	            System.exit(0);
	        }
	        String passengerName=sc.nextLine();
	        String travelClass=sc.nextLine();
	        
	        FlightSeat obj=new FlightSeat(seatNumber,passengerName,travelClass);

	        String seatNumber2=sc.nextLine();
	        String passengerName2=sc.nextLine();
	        String travelClass2=sc.nextLine();
	        FlightSeat obj1=new FlightSeat(seatNumber2,passengerName2,travelClass2);

	        int fhash=seatNumber.hashCode();
	        int shash=seatNumber2.hashCode();
	        System.out.println("Seat1 hashCode: "+fhash);
	        System.out.println("Seat2 hashCode: "+shash);
	        if(fhash==shash)
	        {
	            System.out.println("Hash codes are equal");
	        }
	        else
	        {
	            System.out.println("Hash codes are different");
	        }
	}

}
class FlightSeat
{
    public String seatNumber;
    public String passengerName;
    public String travelClass;
    public FlightSeat(String seatNumber,String passengerName,String travelClass)
    {
        this.seatNumber=seatNumber;
        this.passengerName=passengerName;
        this.travelClass=travelClass;
    } 
    public int hashCode()
    {
        return seatNumber.hashCode();
    }
}
