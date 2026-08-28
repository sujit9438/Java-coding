package classObject;

import java.util.Scanner;

public class Quation10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter vehicle Details");
		
		String vehicleName=sc.nextLine();
		
		double fuel=sc.nextDouble();
		
		Vehicle a=new Vehicle(vehicleName,fuel);
		sc.nextLine();
		System.out.println("Refuel amount");
		int r=sc.nextInt();
		a.refuel(r);
		
		System.out.println("Enter Drive");
		int d=sc.nextInt();
		a.drive(d);
		
		a.displayVehicleInfo();
	}

}
class Vehicle
{
	public String vehicleName;
	public double fuel;
	public Vehicle(String vehicleName, double fuel) {
		
		this.vehicleName = vehicleName;
		this.fuel = fuel;
	}
	void refuel(int amount)
	{
		fuel = fuel + amount;
		System.out.println("Fule add"+amount);
		
	}
	void drive(int amount)
	{
        if (fuel < amount) {
            System.out.println("Not enough fuel");
        } else {
            fuel = fuel - amount;
            System.out.println("Vehicle driven successfully");
        }
	}
	void displayVehicleInfo()
	{
		System.out.println("\n----- Vehicle Information -----");
        System.out.println("Vehicle Name : " + vehicleName);
        System.out.println("Fuel         : " + fuel);
	}
	
}
