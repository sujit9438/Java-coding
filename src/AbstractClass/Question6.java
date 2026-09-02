package AbstractClass;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		
		System.out.println("Enter your salary");
		double salary=sc.nextDouble();
		Employee5 obj= FactoryClass.getImplementionObject(choice);
		
		System.out.println("Bonus : "+obj.calculateBonus(salary));
		
	}

}
abstract class Employee5
{
	public abstract double calculateBonus(double salary);
}
class FactoryClass
{
	public static Employee5 getImplementionObject(int choice)
	{
		Employee5 emp=null;
		switch(choice)
		{
		case 1-> emp=new ContractEmployee();
		case 2-> emp=new PermanentEmployee();
		}
		return emp;
	}
}
class PermanentEmployee extends Employee5
{
	public double calculateBonus(double salary)
	{
		return salary*0.1;
	}
	
	
}
class ContractEmployee extends Employee5
{
	public double calculateBonus(double salary)
	{
		return salary*0.05;
	}
}
