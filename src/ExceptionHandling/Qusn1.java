package ExceptionHandling;

import java.util.Scanner;

public class Qusn1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account holderName,balance,withdraw amount");
		
		String accountHolder=sc.nextLine();
		double balance=sc.nextDouble();
		double amount=sc.nextDouble();
		BankAcccount a= new BankAcccount(accountHolder, balance);
		try
		{
			a.withdraw(amount);
		}
		catch(InsufficientBalanceException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.printf("Remaning Blance: %.2f",a.getBalance());
	}

}
class BankAcccount
{
	private String accountHolder;
	private double balance;
	public BankAcccount(String accountHolder, double balance) 
	{
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void withdraw(double amount)throws InsufficientBalanceException
	{
		if(amount<=0)
		{
			throw new InsufficientBalanceException("Invalid withdraw amount");
		}
		else if(amount>balance)
		{
			throw new InsufficientBalanceException("Insufficient Balance");
		}
		else
		{
			balance-=amount;
			System.out.println("Withdraw Successful");
		}
	}
	
}
class InsufficientBalanceException extends Exception
{

	public InsufficientBalanceException(String errorMessage) 
	{
		super(errorMessage);
	}
	
	
}
