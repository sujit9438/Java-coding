package AbstractClass;

public class Question2 {

	public static void main(String[] args) 
	{
		ATM op1 = new Withdraw();
		op1.process();
		ATM op2= new Deposite();
		op2.process();
		ATM op3 = new CheckBalance();
		op3.process();
	}

}
 abstract class ATM
{
	 final public void process()
	 {
		 insertCard();
		 enterPin();
		 doTransaction();
		 printReceipt();
	 }
	public void insertCard()
	{
		System.out.println("Card is inserted...");
	}
	public void enterPin()
	{
		System.out.println("Pin Entered sucessfully..");
	}
	public abstract void doTransaction();
	public void printReceipt()
	{
		System.out.println("Receipt is printed....");
		System.out.println();
	}
}
 
 class Withdraw extends ATM
 {

	@Override
	public void doTransaction() 
	{
		
		System.out.println("Amount is withdraw sucessfully...!!!");
		
	}
	 
 }
 class Deposite extends ATM
 {

	@Override
	public void doTransaction() {
		System.out.println("Amount is deposite sucessfully..");
		
	}
	 
 }
 class CheckBalance extends ATM
 {

	@Override
	public void doTransaction() 
	{
		System.out.println("Checked the Avaliable balance Sucessfully...!!!");
		
	}
	 
 }
