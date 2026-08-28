package inheritenceProgram;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name=sc.nextLine();
		int id=sc.nextInt();
		int marks=sc.nextInt();
		int attendance=sc.nextInt();
		
		Result a=new Result(name,id,marks,attendance);
		a.displayDetails();
		System.out.println("Grade : "+a.calculateGrade());
		System.out.println("Result : "+a.calculateResult());
	}

}
class Student
{
	public String name;
	public int id;
	public Student(String name, int id) {
		
		this.name = name;
		this.id = id;
	}
	public void displayDetails()
	{
		System.out.println("Name :"+name);
		System.out.println("ID :"+id);
	}
	
}
class Marks extends Student
{
	public int marks;

	public Marks(String name, int id, int marks) {
		super(name, id);
		this.marks = marks;
	}
	public String calculateGrade()
	{
		if(marks>=80)
		{
			return "A";
		}
		else if(marks>=60)
		{
			return "B";
		}
		else
		{
			return "C";
		}
	}
}
class Result extends Marks
{
	public int attendance;

	public Result(String name, int id, int marks, int attendance) {
		super(name, id, marks);
		this.attendance = attendance;
	}
	public String calculateResult()
	{
		if(attendance>=75)
		{
			return "Pass";
		}
		else
		{
			return "Fails";
		}
	}
}