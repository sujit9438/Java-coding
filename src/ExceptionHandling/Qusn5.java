package ExceptionHandling;

import java.util.Scanner;

public class Qusn5 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer name,email");
		String customerName=sc.next();
		String email=sc.next();
		Customer a= new Customer(customerName, email);
		try {
			a.registerCustomer();
		} 
		catch (InvalidEmailException e) 
		{
			System.out.println(e.getMessage());
		}
	}

}
class Customer
{
	private String customerName;
	private String email;
	public Customer(String customerName, String emails) {
		
		this.customerName = customerName;
		this.email = emails;
	}
	public void registerCustomer() throws InvalidEmailException
	{
		if (!email.contains("@")) 
		{
	        throw new InvalidEmailException("Email must contain @ symbol.");
	    }
	    	    else if (email.indexOf("@") != email.lastIndexOf("@")) 
	    	    
	    	    {
	        throw new InvalidEmailException("Email must contain only one @ symbol.");
	    }
	    	    else if (email.startsWith("@") || email.endsWith("@")) 
	    	    {
	        throw new InvalidEmailException("Invalid email format.");
	    }
	    	    else if (!email.substring(email.indexOf("@")).contains(".")) 
	    	    {
	        throw new InvalidEmailException("Email must contain a dot after @.");
	    }
	    	    else if (email.contains("@.") || email.endsWith(".")) 
	    	    {
	        throw new InvalidEmailException("Invalid email format.");
	    }
	    	    else 
	    	    {
	        System.out.println("Customer registration successful.");
	    }
	}
	
}
class InvalidEmailException extends Exception
{

	public InvalidEmailException(String message) {
		super(message);
	}
	
}