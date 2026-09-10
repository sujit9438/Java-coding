package EncapsulationPracticQuestion;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		long number=sc.nextLong();
		String name=sc.next();
		double amount=sc.nextDouble();
		
		BankAccount ob= new BankAccount();
		ob.setAccountNumber(number);
		ob.setAccountHolderName(name);
		ob.deposit(amount);
		ob.deposit(3000);
		
		System.out.println("Account Number : "+ob.getAccountNumber());
		System.out.println("Account Holder : "+ob.getAccountHolderName());
		System.out.println("Balance : "+ob.getBalance());
		
	}

}
class BankAccount
{
	private long accountNumber;
	private String accountHolderName;
	private double balance;
	
	public long getAccountNumber() 
	{
		
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) 
	{
		if(accountNumber >0)
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) 
	{
		
		this.accountHolderName = accountHolderName;
	}
	public double getBalance()
	{
		return balance;
	}
	public void deposit(double amount)
	{
		if(amount>0)
		{

			balance=balance+amount;
		}
	}
	
	
	
}
