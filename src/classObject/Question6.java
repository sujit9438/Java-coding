package classObject;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double l=sc.nextDouble();
		double b=sc.nextDouble();
		Rectangular a= new Rectangular(l,b);
		a.displayDetails();
	}

}
class Rectangular
{
	public double length;
	public double breadth;
	public Rectangular(double length, double breadth) 
	{
		
		this.length = length;
		this.breadth = breadth;
	}
	double calculateArea()
	{
		return length*breadth;
	}
	double calculatePerimeter()
	{
		return 2*(length*breadth);
	}
	void displayDetails()
	{
		System.out.println("Rectangular Length : "+length);
		System.out.println("Rectangular Breadth : "+breadth);
		System.out.println("Rectangular Area : "+calculateArea());
		System.out.println("Rectangular perimeter : "+calculatePerimeter());
	}
	
}
