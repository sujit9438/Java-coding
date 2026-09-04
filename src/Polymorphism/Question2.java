package Polymorphism;

public class Question2 {

	public static void main(String[] args) 
	{
		
	}

}
class Ride
{
	protected double distance;

	public Ride(double distance) 
	{

		this.distance = distance;
	}
	
	
}
class BikeRide extends Ride
{

	public BikeRide(double distance) {
		super(distance);
	}
	public double calculateFare(double surgeMultiplier)
	{
		return 0;
	}
	
}
class AutoRide extends Ride
{

	public AutoRide(double distance) {
		super(distance);
	}
	
}
class CabRide extends Ride
{

	public CabRide(double distance) {
		super(distance);
	}
	
}
