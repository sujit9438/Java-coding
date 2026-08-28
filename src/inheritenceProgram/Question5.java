package inheritenceProgram;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String vehicleNumber=sc.nextLine();
		String fuleType=sc.nextLine();
		
		int rentPerDay=sc.nextInt();
		int luxuryCharge=sc.nextInt();
		int days=sc.nextInt();
		LuxuryCharge a= new LuxuryCharge(vehicleNumber,fuleType,rentPerDay,luxuryCharge);
		System.out.println("Final Rent: "+a.calculateFinalRent(days));
	}

}
class Vehicle
{
	public String vehicleNumber;
	public String fuelType;
	public Vehicle(String vehicleNumber,String fuelType)
	{
		this.vehicleNumber=vehicleNumber;
		this.fuelType=fuelType;
	}
	 public void displayDetsils()
	{
		System.out.println("Vehicle Name"+vehicleNumber);
		System.out.println("Vehicle Fuel Type"+fuelType);
	}
}
class Car extends Vehicle
{
	public int rentPerDay;
	public Car(String vehicleNumber,String fuelType ,int rentPerDay)
	{
		super(vehicleNumber,fuelType);
		this.rentPerDay = rentPerDay;
	}
	public int calculateRent(int days)
	{
		return rentPerDay*days;
	}
}
class LuxuryCharge extends Car
{
	public int luxuryCharge;

	public LuxuryCharge(String vehicleNumber, String fuelType,int rentPerDay, int luxuryCharge) 
	{
		super(vehicleNumber,fuelType,rentPerDay);
		this.luxuryCharge = luxuryCharge;
	}
	public int calculateFinalRent(int days)
	{
		return super.calculateRent(days)+luxuryCharge;
	}
}
