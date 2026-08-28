package Encapulation;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int studentId=sc.nextInt();
		sc.nextLine();
		String studentName=sc.nextLine();
		int marks=sc.nextInt();
		int newMarks=sc.nextInt();
		
		ExamPortal a=new ExamPortal(studentId, studentName, marks);
		a.setMarks(newMarks);
		System.out.println("Marks: "+a.getMarks());
	}

}
class StudentAccount
{
	private int studentId;
	private String studentName;
	private int marks;
	public StudentAccount(int studentId, String studentName, int marks) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
	}
	public int getStudentId() {
		return studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getMarks() {
		return marks;
	}
	public void setMarks(int newMarks) 
	{
		if(newMarks>=0 && newMarks<=100)
		{
			this.marks=newMarks;
			System.out.println("Marks Updated Sucessfully");
		}
		else
		{
			System.out.println("Invalid Marks");
		}
	}
	public void displayDetails()
	{
		System.out.println("Student ID : "+studentId);
		System.out.println("Student Name : "+studentName);
		System.out.println("Students Marks : "+marks);
	}
	
	
}
class ExamPortal extends StudentAccount
{

	public ExamPortal(int studentId, String studentName, int marks) {
		super(studentId, studentName, marks);
	}
	@Override
	public void setMarks(int newMarks)
	{
		if(newMarks>100)
		{
			System.out.println("Marks Cannot Exceed 100");
		}
		else
		{
			super.setMarks(newMarks);
		}
	}
}
