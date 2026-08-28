package inheritenceProgram;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//student details
		System.out.println("Enter Student Details");
		String name=sc.nextLine();
		int id=sc.nextInt();
		sc.nextLine();
		String department=sc.nextLine();
		int marks=sc.nextInt();
		
		//teacher details
		System.out.println("Enter Teacher Details");
		sc.nextLine();
		String tname=sc.nextLine();
		int tid=sc.nextInt();
		sc.nextLine();
		String tdepartment=sc.nextLine();
		double salary=sc.nextDouble();
		
		//admin
		System.out.println("Enter Admin Details");
		sc.nextLine();
		String aname=sc.nextLine();
		int aid=sc.nextInt();
		sc.nextLine();
		String adepartment=sc.nextLine();
		String role=sc.nextLine();
		
		//libarian
		
		System.out.println("Enter Libarian Details");
		sc.nextLine();
		String lname=sc.nextLine();
		int lid=sc.nextInt();
		sc.nextLine();
		String ldepartment=sc.nextLine();
		int lbooksHandled=sc.nextInt();
		
		Studentz s=new Studentz(name,id,department,marks);
		s.displayDetails();
		s.login();
		s.logout();
		s.writeExam();
		
		Teacher t=new Teacher(tname,tid,tdepartment,salary);
		t.displayDetails();
		t.login();
		t.logout();
		t.teacherClass();
		
		Admin a=new Admin(aname,aid,adepartment,role);
		a.displayDetails();
		a.login();
		a.logout();
		a.manageSystem();
		
		Librarian l=new Librarian(lname,lid,ldepartment,lbooksHandled);
		l.displayDetails();
		l.login();
		l.logout();
		l.issueBook();
		
		
	}

}
class User
{
	public String name;
	public int id;
	public String department;
	public User(String name, int id, String department) {
		
		this.name = name;
		this.id = id;
		this.department = department;
	}
	
	
}
class Studentz extends User
{
	public int marks;

	public Studentz(String name, int id, String department, int marks) {
		super(name, id, department);
		this.marks = marks;
	}
	public void displayDetails()
	{
		System.out.println("Name : "+name);
		System.out.println("ID : "+id);
		System.out.println("Department : "+department);
		
	}
	public void login()
	{
		System.out.println("User logged in");
	}
	public void logout()
	{
		System.out.println("User logged out");
	}
	public void writeExam()
	{
		System.out.println("Student is writting exam");
	}
}
class Teacher extends User
{
	public double salary;

	public Teacher(String name, int id, String department, double salary) {
		super(name, id, department);
		this.salary = salary;
	}
	public void displayDetails()
	{
		System.out.println("Name :"+name);
		System.out.println("ID : "+id);
		System.out.println("Department : "+department);
	}
	public void login()
	{
		System.out.println("User logged in");
	}
	public void logout()
	{
		System.out.println("User logged out");
	}
	void teacherClass()
	{
		System.out.println("Teacher is teaching class");
	}
	
}
class Admin extends User
{
	public String role;

	public Admin(String name, int id, String department, String role) {
		super(name, id, department);
		this.role = role;
	}
	void displayDetails()
	{
		System.out.println("Name : "+name);
		System.out.println("ID :"+id);
		System.out.println("Department : "+department);
	}
	void login()
	{
		System.out.println("User logged in");
	}
	void logout()
	{
		System.out.println("User logged out");
	}
	void manageSystem()
	{
		System.out.println("Admin  is managing system");
	}
	
}
class Librarian extends User
{
	public int booksHandled;

	public Librarian(String name, int id, String department, int booksHandled) {
		super(name, id, department);
		this.booksHandled = booksHandled;
	}
	void displayDetails()
	{
		System.out.println("Name : "+name);
		System.out.println("ID :"+id);
		System.out.println("Department : "+department);
	}
	void login()
	{
		System.out.println("User logged in");
		
	}
	void logout()
	{
		System.out.println("User logged out");
	}
	void issueBook()
	{
		System.out.println("Librarian is issuing books");
	}
}
