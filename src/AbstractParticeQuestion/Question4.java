package AbstractParticeQuestion;
import java.util.Scanner;
public class Question4 
{
	
	    public static void main(String[] args) {
	        // Write your code here
	        Employee ob = new Devloper();
	        ob.work();
	        Employee.companyPolicy();
	    }
	}
	abstract class Employee
	{
	    public Employee()
	    {
	        System.out.println("Employee constructor called");
	    }
	    public abstract void work();
	    public static void companyPolicy()
	    {
	        System.out.println("All employees must follow company policies");
	    }
	}
	class Devloper extends Employee
	{
	    public void work()
	    {
	        System.out.println("Developer is coding");
	    }
	
}
