package inheritenceProgram;
import java.util.Scanner;
public class Question11 
{
	
	    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    int income=sc.nextInt();
	    int creditScore=sc.nextInt();

	    CreditCrad ob = new CreditCrad(income,creditScore);


	        
	    }
	}
	class Customer
	{
	   public int income ;
	   public int creditScore;
	   public Customer(int income,int creditScore)
	   {
	    this.income=income;
	    this.creditScore=creditScore;
	   }
	}
	class CreditCrad extends Customer
	{
	    public CreditCrad(int income,int creditScore)
	    {
	        super(income,creditScore);
	        if(income >= 500000 && creditScore >= 750)
	    {
	        System.out.println("Limit: 500000");
	    }
	    else if(income >= 400000 && creditScore >= 700)
	    {
	        System.out.println("Limit: 200000");
	    }
	    else if(income >= 300000 && creditScore >= 650)
	    {
	        System.out.println("Limit: 100000");
	    }
	    else{
	        System.out.println("Rejected");
	    }
	    }
	    
	

}
