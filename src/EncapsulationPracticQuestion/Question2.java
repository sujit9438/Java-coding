package EncapsulationPracticQuestion;
import java.util.Scanner;
public class Question2 
{

	    public static void main(String[] args) {
	        // Write your code here
	        Scanner sc = new Scanner(System.in);
	        Account a= new Account();
	        int currentPin=sc.nextInt();
	         int newPin=sc.nextInt();
	        
	        
	        
	           
	            a.changePin(currentPin,newPin);
	       
	        
	    }
	}
	class Account
	{
	    private int pin=1234;
	    
	   
	    public void changePin(int currentPin,int newPin)
	    {
	        if(currentPin==pin)
	        {
	            currentPin=newPin;
	            System.out.println("Current PIN: "+pin);
	            System.out.println("New PIN: "+newPin);
	            System.out.println("PIN changed successfully.");
	        }
	        else{
	            System.out.println("Incorrect current PIN. PIN change failed.");
	        }

	           
	    }
	    
	


}
