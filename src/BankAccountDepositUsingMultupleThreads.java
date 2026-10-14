
public class BankAccountDepositUsingMultupleThreads {

	public static void main(String[] args) throws InterruptedException 
	{
		BankAccount a= new BankAccount();
		
		CustomerOne t1= new CustomerOne(a);
		t1.setName("Ramesh");
		
		CustomerTwo t2= new CustomerTwo(a);
		t2.setName("Suresh");
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println("Final balance is: "+a.balance);
	}

}
class BankAccount
{
	public double balance=1000;
	
	public synchronized void deposit(double amount)
	{
		
		balance+=amount;
		System.out.println("Deposit of "+amount+" is done susessfully");
	}
	
}
class CustomerOne extends Thread
{
	public BankAccount ba;

	public CustomerOne(BankAccount ba) {
		
		this.ba = ba;
	}
	public void run()
	{
		ba.deposit(500);
	}
	
}
class CustomerTwo extends Thread
{
	public BankAccount ba;

	public CustomerTwo(BankAccount ba) {
		
		this.ba = ba;
	}
	public void run()
	{
		ba.deposit(700);
	}
	
}
