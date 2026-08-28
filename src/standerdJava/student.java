package standerdJava;
import java.util.Scanner;

public class student {
	
	    public static void main(String []args)
	    {
	        Scanner sc= new Scanner(System.in);
	        System.out.println("enyter name marks of 3 sub");
	        String name = sc.nextLine();
	        double m1=sc.nextDouble();
	        double m2= sc.nextDouble();
	        double m3=sc.nextDouble();
	        double total=m1+m2+m3;
	        System.out.println("Total = "+total);
	        double avg=(m1+m2+m3)/3;
	        System.out.printf("Average = %.2f\n",avg);
	        if(m1<0 && m2<0 && m3<0)
	        {
	            System.out.println("Invalid marks");
	        }
	       else if(avg>=35){
	            System.out.println("Result = Pass");
	        }
	        else{
	            System.out.println("Fail");
	        }
	    }
	}


