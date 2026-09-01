package EncapsulationPracticQuestion;
import java.util.Scanner;

public class Question5 
{
	
	
	    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    String studentName=sc.nextLine();
	    int daysPresent=sc.nextInt();
	    double costPerDay=sc.nextDouble();

	    Requirement ob= new Requirement(studentName,daysPresent,costPerDay);

	    ob.totalBill();

	        
	    }
	}
	class Requirement
	{
	    private String studentName;
	    private int daysPresent;
	    private double costPerDay;
	     public Requirement(String studentName,int daysPresent,double costPerDay)
	     {
	        this.studentName=studentName;
	        this.daysPresent=daysPresent;
	        this.costPerDay=costPerDay;
	     }
	     public void totalBill()
	     {
	        if(daysPresent<=0)
	        {
	            System.out.println("Invalid Days");
	        }
	        else if(costPerDay<=0)
	        {
	            System.out.println("Invalid Cost");
	        }
	        else 
	        {
	          double totalBill=  daysPresent*costPerDay;
	        }
	     }
	

}
