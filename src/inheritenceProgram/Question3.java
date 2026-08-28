package inheritenceProgram;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name=sc.nextLine();
		int id=sc.nextInt();
		int salary=sc.nextInt();
		int bonus=sc.nextInt();
		BonusEmployee a=new BonusEmployee(name,id,salary,bonus);
		a.displayDetails();
		System.out.println("Total Salary :"+a.calculateSalary());
	}

}
class Employee
{
	public String name;
	public int id;
	public int salary;
	public Employee(String name, int id, int salary) {
		
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public void displayDetails()
	{
		System.out.println("Nmae :"+name);
		System.out.println("ID :"+id);
		System.out.println("Salary :"+calculateSalary());
	}
	public int calculateSalary()
	{
		return salary;
	}
	
}
class BonusEmployee extends Employee
{
	public int bonus;

	public BonusEmployee(String name, int id, int salary, int bonus) {
		super(name, id, salary);
		this.bonus = bonus;
	}
	 public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Bonus :"+bonus);
	}
	 public int calculateSalary()
	 {
		int totalSalary=salary+bonus;
		return totalSalary;
	 }
}
