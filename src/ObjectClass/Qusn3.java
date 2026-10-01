package ObjectClass;

import java.util.Scanner;

public class Qusn3 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        
        String accountNumber=sc.nextLine();
        String accountType=sc.nextLine();
        String accountHolder=sc.nextLine();
        double balance=sc.nextDouble();
        if(balance<0)
        {
            System.out.println("Error: Balance must be non-negative");
            System.exit(0);
        }
        BankAccount a=new BankAccount(accountNumber,accountType,accountHolder,balance);

        sc.nextLine();
        String accountNumber2=sc.nextLine();
        String accountType2=sc.nextLine();
        String accountHolder2=sc.nextLine();
        double balance2=sc.nextDouble();
        BankAccount b=new BankAccount(accountNumber2,accountType2,accountHolder2,balance2);

        if(a.equals(b))
        {
            System.out.println("Accounts are equal");

        }
        else
        {
            System.out.println("Accounts are not equal");
        }
	}

}
class BankAccount
{
    public String accountNumber;
    public String accountType;
    public String accountHolder;
    public double balance;
    public  BankAccount(String accountNumber, String accountType, String accountHolder, double balance)
    {
        this.accountNumber=accountNumber;
        this.accountType=accountType;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    public boolean equals(Object o)
    {
        BankAccount temp=(BankAccount) o;
        return ((this.accountNumber.equals(temp.accountNumber))&&(this.accountType.equals(temp.accountType)));
    }
}