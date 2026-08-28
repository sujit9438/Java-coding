package classObject;

import java.util.Scanner;

public class Question5 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter brand name , price , batterypercentages");
		String brand=sc.nextLine();
		double price=sc.nextDouble();
		double batterPercentage=sc.nextDouble();
		Mobile a=new Mobile(brand,price,batterPercentage);
		a.chargerBattery(100);
		a.useMobile(12);
		a.displayMobileInfo();
	}

}
class Mobile
{
	public String brand;
	public double price;
	public double batterPercentage;
	public Mobile(String brand, double price, double batterPercentage) 
	{
		
		this.brand = brand;
		this.price = price;
		this.batterPercentage = batterPercentage;
	}
	void chargerBattery(int amount)
	{
		batterPercentage++;
	}
	void useMobile(int amount)
	{
		batterPercentage--;
	}
	void displayMobileInfo()
	{
		System.out.println("Brand :"+brand);
		System.out.println("Mobile Price : "+price);
		System.out.println("Battery Percentages : "+batterPercentage);
		
		
	}
	
}
