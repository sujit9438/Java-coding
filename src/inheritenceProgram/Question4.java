package inheritenceProgram;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name=sc.nextLine();
		int age=sc.nextInt();
		int salary=sc.nextInt();
		int bonus=sc.nextInt();
		Manager a= new Manager(name,age,salary,bonus);
		a.displayDetails();
	}

}
class Person
{
	public String name;
	public int age;
	public Person(String name, int age) {
	
		this.name = name;
		this.age = age;
	}
	public void displayDetails()
	{
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
	}
	
}
class Employee1 extends Person
{
	public int salary;

	public Employee1(String name, int age, int salary) {
		super(name, age);
		this.salary = salary;
	}
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Salary :"+salary);
	}
}
class Manager extends Employee1
{
	public int bonus;

	public Manager(String name, int age, int salary, int bonus) {
		super(name, age, salary);
		this.bonus = bonus;
	}
	public void displayDetails()
	{
		super.displayDetails();
		int totalSalary=salary+bonus;
		System.out.println("Bonus :"+bonus);
		System.out.println("TotalSalary :"+totalSalary);
		
	}
}
