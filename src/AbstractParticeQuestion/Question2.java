package AbstractParticeQuestion;
import java.util.Scanner;
public class Question2 
{
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int choice=sc.nextInt();
	        RemoteControl ob= new TVRemote();

	        switch(choice)
	        {
	            case 1->ob.turnOn();
	            case 2->ob.turnOff();
	            default -> System.out.println("Invalid choice");
	        }

	        
	    }
	}
	abstract class RemoteControl
	{
	    public abstract void  turnOn();
	    public abstract void turnOff();
	}
	class TVRemote extends RemoteControl
	{
	  public  void turnOn()
	    {
	        System.out.println("TV is turned ON");
	    }
	    public void turnOff()
	    {
	        System.out.println("TV is turned OFF");
	    }

	

}
