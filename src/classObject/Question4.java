package classObject;

import java.util.Scanner;

public class Question4 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String name=sc.nextLine();
		double basicSalary=sc.nextDouble();
		Employee a= new Employee(name,basicSalary);
		a.displaySalaryDetails();
	}

}
class Employee
{
	public String name;
	public double basicSalary;
	public Employee(String name, double basicSalary) 
	{
		
		this.name = name;
		this.basicSalary = basicSalary;
	}
	double calculateHRA()
	{
		return basicSalary*0.10;
	}
	double calculateDA()
	{
		return basicSalary*0.20;
	}
	double totalSalary()
	{
		return basicSalary+calculateHRA()+calculateDA();
	}
	void displaySalaryDetails()
	{
		System.out.println("\n----- Employee Salary Details -----");
        System.out.println("Name          : " + name);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("HRA (10%)     : " + calculateHRA());
        System.out.println("DA (20%)      : " + calculateDA());
        System.out.println("Total Salary  : " + totalSalary());
	}
	
}
