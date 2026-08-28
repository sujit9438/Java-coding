package classObject;

import java.util.Scanner;

public class Question3 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name ");
		String name=sc.nextLine();
		System.out.println("Enter 3 subjects marks ");
		int marks1=sc.nextInt();
		int marks2= sc.nextInt();
		int marks3=sc.nextInt();
		Student a= new Student(name,marks1,marks2,marks3);
		
		a.displayResult();
		
		
	}

}
class Student
{
	public String name;
	public int marks1,marks2,marks3;
	public Student(String name, int marks1, int marks2, int marks3) 
	{
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}
	int calculateTotal()
	{
		return marks1+marks2+marks3;
	}
	int calculateAverage()
	{
		return (marks1+marks2+marks3)/3;
	}
	void displayResult()
	{
		System.out.println("Student name : "+name);
		System.out.println("mark1 : "+marks1);
		System.out.println("mark2 : "+marks2);
	    System.out.println("mark3 : "+marks3);
	    System.out.println("Total Marks : "+calculateTotal());
	    System.out.println("Average : "+calculateAverage());

	}
	
}
