package ExceptionHandling;

import java.util.Scanner;

public class Qusn7 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
      try
      {
        New.evaluateResult(a);
      }
      catch(LowScoreException e)
      {
        System.out.println(e.getMessage());
      }
        
    }
}
class New{
    public static void evaluateResult(int score) throws LowScoreException
   {
       if(score<40)
       {
           throw new LowScoreException("Failed due to low score: Candidate scored below the minimum pass mark.");
       }
       else
       {
           
           System.out.println("Passed");
       }
   }
}
class LowScoreException extends Exception
{
   public LowScoreException(String message)
   {
       super(message);
   }
}
