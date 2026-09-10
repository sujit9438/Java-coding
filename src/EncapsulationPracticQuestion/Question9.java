package EncapsulationPracticQuestion;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		int employeedId=sc.nextInt();
		sc.nextLine();
		String employeeName=sc.nextLine();
		double salary=sc.nextDouble();
		double percentage=sc.nextDouble();
		
		Employee99 ob = new Employee99();
		
		ob.setEmployeedId(employeedId);
		ob.setEmployeeName(employeeName);
		ob.setSalary(salary);
		ob.increaseSalary(percentage);
		
		System.out.println("EmployeeId : "+ob.getEmployeedId());
		System.out.println("Employee Name : "+ob.getEmployeeName());
		System.out.println("Salary : "+ob.getSalary());
	}

}
class Employee99
{
	private int employeedId;
	private String employeeName;
	private double salary;
	
	public int getEmployeedId() {
		return employeedId;
	}
	public void setEmployeedId(int employeedId) 
	{
		if(employeedId >0)
		this.employeedId = employeedId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	
	void increaseSalary(double percentage)
	{
		if(percentage >=0 && percentage <=100 )
		{
		double increae=salary*percentage/100;
		double newSalary=salary+increae;
		this.salary=newSalary;
		}
	}
}
