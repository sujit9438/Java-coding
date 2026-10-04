package PracticeProgram;

import java.util.Scanner;

public class BankAccountManagementSystem {

	public static void main(String[] args) 
	{
		BankAccount account1 = new BankAccount(
                "ACC101",
                "Rahul",
                10000,
                "Savings"
        );

        BankAccount account2 = new BankAccount(
                "ACC102",
                "Priya",
                5000,
                "Current"
        );

        BankAccount account3 = new BankAccount(
                "ACC103",
                "Amit",
                7500,
                "Savings"
        );

        // Display initial details
        account1.displayAccountDetails();
        account2.displayAccountDetails();
        account3.displayAccountDetails();

        // Test deposit
        System.out.println("\n--- Deposit Test ---");
        account1.deposit(2000);
        System.out.println("Account 1 Balance: " + account1.getBalance());

        // Test withdrawal
        System.out.println("\n--- Withdrawal Test ---");
        boolean withdrawal = account1.withdraw(3000);

        if (withdrawal) {
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Withdrawal failed.");
        }

        System.out.println("Account 1 Balance: " + account1.getBalance());

        // Test invalid withdrawal
        System.out.println("\n--- Invalid Withdrawal Test ---");
        boolean invalidWithdrawal = account1.withdraw(50000);

        if (invalidWithdrawal) {
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Withdrawal failed due to insufficient balance.");
        }

        System.out.println("Account 1 Balance: " + account1.getBalance());

        // Test transfer
        System.out.println("\n--- Transfer Test ---");
        boolean transfer = account1.transferMoney(account2, 2000);

        if (transfer) {
            System.out.println("Transfer successful.");
        } else {
            System.out.println("Transfer failed.");
        }

        System.out.println("Account 1 Balance: " + account1.getBalance());
        System.out.println("Account 2 Balance: " + account2.getBalance());

        // Test total account count
        System.out.println("\n--- Total Account Test ---");
        System.out.println(
                "Total Accounts Created: " + BankAccount.getTotalAccounts()
        );
		
		
	}

}
class BankAccount
{
	private String accountNumber;
	private String accountHolder;
	private double balance;
	private String accountType;
	
	private static String bankName="SBI BANK";
	private static int totalAccount=0;
	public BankAccount(String accountNumber, String accountHolder, double balance, String accountType) 
	{
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		if (balance >= 0) 
		{
            this.balance = balance;
        } else 
        {
            this.balance = 0;
            System.out.println("Invalid starting balance. Balance set to 0.");
        }
		this.accountType = accountType;
		totalAccount++;
	}
	public void deposit(double amount)
	{
		if (amount > 0) 
		{
            balance += amount;
            System.out.println("Deposited: " + amount);
        } 
		else 
        {
            System.out.println("Invalid deposit amount.");
        }
	}
	public boolean withdraw(double amount)
	{
		if(amount>0 && amount<balance)
		{
			balance-=amount;
			return true;
		}
		else
		{
			return false;
		}
	}
	public double getBalance()
	{
		return balance;
	}
	public void displayAccountDetails()
	{
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Account HolderName: "+accountHolder);
		System.out.println("Account Type: "+accountType);
		System.out.println("Balance : "+balance);
		System.out.println("Bank Name : "+bankName);
	}
	public static int getTotalAccounts()
	{
		return totalAccount;
	}
	public boolean transferMoney(BankAccount receiver , double amount)
	{
		if (receiver == null || amount <= 0 || amount > balance) 
		{
            return false;
        }

        balance -= amount;
        receiver.balance += amount;

        return true;
	}
	
	
	
}
