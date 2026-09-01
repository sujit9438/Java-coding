package AbstractParticeQuestion;
import java.util.Scanner;

public class Question3 
{
	
	    public static void main(String[] args) {
	        // Write your code here
	        Scanner sc = new Scanner(System.in);
	        int choice = sc.nextInt();
	        Demo ob= new DemoImpl();

	        switch(choice)
	        {
	            case 1->ob.method();
	            default ->System.out.println("Invalid choice.");
	        }
	        
	    }
	}
	abstract class Demo
	{
	    public abstract void method();

	} 
	class DemoImpl extends Demo
	{
	    public void method()
	    {
	        System.out.println("Method executed successfully.");
	    }
	

}
