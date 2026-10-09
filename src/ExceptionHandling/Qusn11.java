package ExceptionHandling;

import java.util.Scanner;

public class Qusn11 {

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
	        int balance=sc.nextInt();
	        int wAmount=sc.nextInt();
	        Bnak a= new Bnak();
	        try
	        {
	            a.withdraw(balance,wAmount);
	        }
	        catch(InsufficientBalanceException e)
	        {
	            System.out.println(e.getMessage());
	        }
	}

}
class Bnak
{
    public void withdraw(int balance , int wAmount)throws InsufficientBalanceException
    {
        if(balance<wAmount||balance<0)
        {
            throw new InsufficientBalanceException("Error: Insufficient balance");
        }
        else
        {
            System.out.println("Withdrawal successful");
        }
    }
}
class InsufficientBalanceException extends Exception 
{
    public InsufficientBalanceException(String message)
    {
        super(message);
    }
}
