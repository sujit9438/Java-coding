package classObject;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter AccountHolderName , AccountNumber ,Balance");
		String accountHolderName=sc.nextLine();
		String accountNumber=sc.nextLine();
		double balance=sc.nextDouble();
		
		BankAccount a=new BankAccount(accountHolderName, accountNumber, balance);
		a.deposit(500);
		a.withdraw(10000);
		a.displayBalance();
		
	}

}
class BankAccount
{
	public String accountHolderName;
	public String accountNumber;
	public Double balance;
	public BankAccount(String accountHolderName, String accountNumber, Double balance) 
	{
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public void deposit(double amount)
	{
		balance=balance+amount;
		System.out.println("Deposit of "+amount+"is done sucessfully..!!");
	}
	public void withdraw(double amount)
	{
		if(amount>balance)
		{
			System.out.println("Insufficient balance..");
		}
		else
		{
			balance-=amount;
			System.out.println("Amount of "+amount+"is deducted sucessfully..");
		}
	}
	public void displayBalance()
	{
		System.out.println("Current Balance is : "+balance);
	}
	
	
}
