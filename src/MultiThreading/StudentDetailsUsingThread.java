package MultiThreading;

import java.util.Scanner;

public class StudentDetailsUsingThread {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int id=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		String course=sc.nextLine();
		Student78 a = new Student78(id, name, course);
		StudentDetailsThread t1= new StudentDetailsThread(a);
		CourceDetaildThread t2= new CourceDetaildThread(a);
		t1.start();
		t2.start();
	}

}
class Student78
{
	int studentId;
	String studentName;
	String cource;
	public Student78(int studentId, String studentName, String cource) 
	{	
		this.studentId = studentId;
		this.studentName = studentName;
		this.cource = cource;
	}
	
}
class StudentDetailsThread extends Thread
{
	public Student78 s;
	
	public StudentDetailsThread(Student78 s) 
	{
		this.s = s;
	}
	public void run()
	{
		System.out.println("Student id : "+s.studentId);
		System.out.println("Student Name :"+s.studentName);
	}
}
class CourceDetaildThread extends Thread
{
	public Student78 s;
	
	public CourceDetaildThread(Student78 s) 
	{
		this.s = s;
	}
	public void run()
	{
		System.out.println("Student Cource Name : "+s.cource);
		
	}
}

