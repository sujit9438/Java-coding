package arrayProgramClass;

import java.awt.DefaultFocusTraversalPolicy;
import java.util.Scanner;

public class ArrayReference2 
{
	static Employee98 [] a;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of employees");
		int size=sc.nextInt();
		a=new Employee98[size];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter EmployeeID, EmployeeName, Department , Salary : "+(i+1));
			int employeeId=Integer.parseInt(IO.readln());
			String employeeName=IO.readln();
			String depeartment=IO.readln();
			double salary=Double.parseDouble(IO.readln());
			a[i] = new Employee98(employeeId, employeeName, depeartment, salary);
			sc.nextLine();
			 
		}
		System.out.println("===========================================");
		System.out.println("Enter 1 for printing the details employees belong to the given Department");
		System.out.println("Enter 2 for printing the details employees who are having salary greater yhan given salary");
		System.out.println("Enter 3 for Average Salary ");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1->
			{
				sc.nextLine();
				System.out.println("Enter department name");
				String dept=sc.nextLine();
				empBelogToGivenDepartment(dept);
			}
			case 2->
			{
				System.out.println("Enter the target salary");
				double salary=sc.nextDouble();
				empGreaterThanGivenSalary(salary);
			}
			case 3->
			{
				avgSalary();
			}
			default ->
			{
				System.out.println("Enter valid choice ");
			}
		}
		
	}
	public static void empBelogToGivenDepartment(String departmentName)
	{
		for(Employee98 b:a)
		{
			if(departmentName.equals(b.depeartment))
			{
				b.displayDetails();
				System.out.println("============================");
			}
		}
	}
	public static void empGreaterThanGivenSalary(double salary)
	{
		for(Employee98 b:a)
		{
			if(salary<b.salary)
			{
				b.displayDetails();
				System.out.println("============================");
			}
		}
	}
	public static void avgSalary()
	{
		double sum=0;
		for(Employee98 b:a)
		{
			sum+=b.salary;
		}
		System.out.println("Average Salary :-"+(sum/a.length));
	}

}
class Employee98
{
	public int employeeId;
	public String employeeName;
	public String depeartment;
	public double salary;
	
	public Employee98(int employeeId, String employeeName, String depeartment, double salary) 
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.depeartment = depeartment;
		this.salary = salary;
	}
	public void displayDetails()
	{
		System.out.println("Employee ID :- "+employeeId);
		System.out.println("Employee Name :- "+employeeName);
		System.out.println("Employee Department:-"+depeartment);
		System.out.println("Employee Salary :-"+salary);
	}
}
