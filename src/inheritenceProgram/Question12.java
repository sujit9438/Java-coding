package inheritenceProgram;
import java.util.Scanner;
public class Question12 
{
	    public static void main(String[] args) {
	        // Write your code here
	        Scanner sc = new  Scanner(System.in);

	        String name=sc.nextLine();
	        int salary=sc.nextInt();

	        Bonus ob = new Bonus(name,salary);
	        
	    }
	}
	class Employee6
	{
	    public String name;
	    public int salary;
	    public Employee6(String name, int salary)
	    {
	        this.name=name;
	        this.salary=salary;
	    }
	}
	class Bonus extends Employee6
	{
	    public Bonus(String name,int salary)
	    {
	        super(name,salary);

	        if(salary>= 30000)
	        {
	            System.out.println("Bonus: "+(salary*10)/100);
	        }
	        else
	        {
	            System.out.println("Bonus: 0");
	        }
	    }

}
