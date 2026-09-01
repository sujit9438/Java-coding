package AbstractParticeQuestion;
import java.util.Scanner;
public class Question5 
{
	    public static void main(String[] args) {
	        // Write your code here
	        Scanner sc = new Scanner(System.in);
	        Employee4 ob;
	        int choice =sc.nextInt();
	        switch(choice)
	        {
	            case 1-> {
	                ob=new Manager();
	                ob.work();
	            }
	            case 2->{
	                    ob= new Engineer();
	                ob.work();
	            }
	            default -> System.out.println("Invalid Choice. Please select 1 or 2.");
	        }
	    }
	}abstract class Employee4
	{
	    public abstract void work();

	}
	class Manager extends Employee4
	{
	    public void work()
	    {
	        System.out.println("Manager is planning and organizing tasks.");
	    }
	}class Engineer extends Employee4
	{
	    public void work()
	    {
	        System.out.println("Engineer is writing code and fixing bugs.");
	    }

}
