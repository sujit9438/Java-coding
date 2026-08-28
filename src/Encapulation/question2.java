package Encapulation;

import java.util.Scanner;

public class question2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int employeeId=sc.nextInt();
		sc.nextLine();
		String employeeName=sc.nextLine();
		
		double salary=sc.nextDouble();
		double newSalary=sc.nextDouble();
		HRDepartment a= new HRDepartment(employeeId, employeeName, salary);
	
		a.setSalary(newSalary);
		System.out.println("Salary : "+a.getSalary());
		
	}

}
class Employee
{
	private int employeeId;
	private String employeeName;
	private double salary;
	public Employee(int employeeId, String employeeName, double salary) 
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	public int getEmployeeId()
	{
		return employeeId;
	}
	public String getEmployeeName()
	{
		return employeeName;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double newSalary)
	{
	
		if(newSalary<0)
		{
			System.out.println("Invalid Salary");
		}
		else {
			this.salary=newSalary;
			System.out.println("Salary update Sucessfully");
		}
	}
	
	public void displayEmployee()
	{
		System.out.println("Employee ID : "+employeeId);
		System.out.println("Employee Name :"+employeeName);
		System.out.println("Salary : "+salary);
	}
	
}
class HRDepartment extends Employee
{

	public HRDepartment(int employeeId, String employeeName, double salary) 
	{
		super(employeeId, employeeName, salary);
	}
	
	@Override
	public void setSalary(double newSalary)
	{
		if(newSalary>1.5*getSalary())
		{
			System.out.println("Increment Limit Exceeded");
		}
		else
		{
			super.setSalary(newSalary);
		}
	}
	
}