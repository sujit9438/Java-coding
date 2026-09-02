package inheritenceProgram;

 import java.util.Scanner;
public class Question8 
{

	    public static void main(String[] args) {
	        // Write your code here
	        Scanner sc = new Scanner(System.in);
	        String name=sc.nextLine();
	        String status=sc.nextLine();
	        CheckUp ob = new CheckUp(name,status);
	        ob.displayCheckupStatus();
	    }
	}
	class Patient 
	{
	  public String name;
	  public Patient(String name)
	  {
	    this.name=name;
	  }
	}
	class CheckUp extends Patient
	{
	    public String status;
	    public CheckUp(String name, String status)
	    {
	        super(name);
	        this.status=status;
	    }
	    public void displayCheckupStatus()
	    {
	        System.out.println("Checkup "+status);
	    }
	

}
