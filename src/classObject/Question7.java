package classObject;

import java.util.Scanner;

public class Question7 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Circul Radius ");
		double r=sc.nextDouble();
		Circle a=new Circle(r);
		a.displayCircleInfo();
	}

}
class Circle
{
	public double radius;

	public Circle(double radius) 
	{
		this.radius = radius;
	}
	double calculateArea()
	{
		return 3.14*(radius*radius);
	}
	double calculateCircumference()
	{
		return 2*3.14*radius;
	}
	void displayCircleInfo()
	{
		System.out.println("Circle Radius : "+radius);
		System.out.println("Circle Area : "+calculateArea());
		System.out.println("Circle Circumference : "+calculateCircumference());
	}

	
}
