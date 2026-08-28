package Encapulation;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account number and balance");
		String accountNumber=sc.nextLine();
		double balance=sc.nextDouble();
		System.out.println("Enter to deposite");
		double deposit=sc.nextDouble();
		System.out.println("Enter amount to withdraw");
		double withdraw=sc.nextDouble();
		
		MobileApp acc = new MobileApp(accountNumber, balance);
		acc.deposit(deposit);
		acc.withdraw(withdraw);
		System.out.println("Final availabel balance : "+acc.getBalance());
		
	}

}
class BankAccount
{
	private String accountNumber;
	private double balance;
	public BankAccount(String accountNumber, double balance) 
	{
		
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public void deposit(double amount)
	{
		if(amount>0)
		{
			balance+=amount;
			System.out.println("Amount of "+amount+" is been deposited");
		}
		else
		{
			System.out.println("Invalid Deposit amount");
		}
	}
	public void withdraw(double amount)
	{
		if(amount>0&& amount<=balance)
		{
			balance-=amount;
			System.out.println("Withdraw of "+amount+ " is done sucessfully");
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
	public double getBalance()
	{
		return balance;
	}
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	
}
class MobileApp extends BankAccount
{

	public MobileApp(String accountNumber, double balance) 
	{
		super(accountNumber, balance);
		
	}
	public void withdraw(double amount)
	{
		if(amount>25000)
		{
			System.out.println("Dailly limit is excessed");
		}
		else
		{
			super.withdraw(amount);
		}
	}
	
}
