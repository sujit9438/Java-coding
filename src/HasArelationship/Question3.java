package HasArelationship;
//aggregation
public class Question3 {

	public static void main(String[] args) 
	{
		Customer c1= new Customer("Sujit","saving",4000); 
		Customer c2= new Customer("mukesh","current",1000); 
		Customer c3= new Customer("kotti","fixed deposite",5000); 
		
		Bank icici=new Bank("HDFC","Hyderbad",c1,c2,c3);
		icici.displayDetails();
	}

}
class Bank
{
	String name;
	String place;
	Customer c1;
	Customer c2;
	Customer c3;
	public Bank(String name, String place, Customer c1, Customer c2, Customer c3) {
		
		this.name = name;
		this.place = place;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
	}
	public void displayDetails()
	{
		System.out.println("Bank name : "+name);
		System.out.println("Place : "+place);
		System.out.println("--------------------------------");
		System.out.println("Customer 1 Details : ");
		c1.displayDetails();
		System.out.println("--------------------------------");
		System.out.println("Customer 2 Details : ");
		c2.displayDetails();
		System.out.println("--------------------------------");
		System.out.println("Customer 3 Details : ");
		c3.displayDetails();
		
	}

	
}
class Customer
{
	String name;
	String accType;
	double balance;
	public Customer(String name, String accType, double balance) 
	{
		
		this.name = name;
		this.accType = accType;
		this.balance = balance;
	}
	public void displayDetails()
	{
		System.out.println("Nmae of coustmer :"+name);
		System.out.println("Account type "+accType);
		System.out.println("Avaliable Balance "+balance);
	}
	
}

