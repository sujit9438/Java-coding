package ExceptionHandling;

import java.util.Scanner;

public class Qusn8 {
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int book=sc.nextInt();
        int members=sc.nextInt();
        try
        {
            Libary.memeber(book,members);
        }
        catch(BorrowLimitExceededException e)
        {
            System.out.println(e.getMessage());
        }
        
    }
}
class Libary
{
    public static void memeber(int book,int members)throws BorrowLimitExceededException
    {
        if(members>=book)
        {
            throw new BorrowLimitExceededException("BorrowLimitExceededException: Limit "+book+" reached");
        }
        else
        {
            System.out.println("Book borrowed successfully");
        }
    }
}
class BorrowLimitExceededException extends Exception 
{
    public BorrowLimitExceededException(String message)
    {
        super(message);
    }
}
