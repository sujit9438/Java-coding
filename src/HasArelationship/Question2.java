package HasArelationship;
//AssociationDemo

public class Question2 {

	public static void main(String[] args) 
	{
		Pen  a= new Pen("elkos","Black","ball pen",100);
		Student b= new Student("Sujit",19,100,a);
		b.displayDetails();
	}
}

class Student
{
	String name;
	int age;
	int rollNumber;
	Pen pen;
	public Student(String name, int age, int rollNumber, Pen pen) 
	{
		
		this.name = name;
		this.age = age;
		this.rollNumber = rollNumber;
		this.pen = pen;
	}
	public void displayDetails()
	{
		System.out.println(" name : "+name);
		System.out.println("age : "+age);
		System.out.println("Roll Number "+rollNumber);
		System.out.println("Pen details ");
		pen.displayDetails();
	}
	
}
class Pen
{
	String brand;
	String colour;
	String type;
	double price;
	public Pen(String brand, String colour, String type, double price) 
	{
		
		this.brand = brand;
		this.colour = colour;
		this.type = type;
		this.price = price;
	}
	public void displayDetails()
	{
		System.out.println("Brand name : "+brand);
		System.out.println("Colour : "+colour);
		System.out.println("Type "+type);
		System.out.println("Price "+price);
	}
	
	
}
