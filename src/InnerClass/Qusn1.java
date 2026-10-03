package InnerClass;

import java.util.Scanner;

public class Qusn1 
{
	
	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	        String movieName=sc.nextLine();
	       
	        int ticketSold=sc.nextInt();
	        double ticketPrice=sc.nextDouble();
	        if(ticketPrice<0)
	        {
	            System.out.println("Error: Tickets sold cannot be negative and ticket price must be greater than zero");
	            System.exit(0);
	        }
	         System.out.println("Movie: "+movieName);

	        MovieShow a=new MovieShow(movieName,ticketSold,ticketPrice);

	        MovieShow.RevenueCalculator b=new MovieShow(movieName,ticketSold,ticketPrice).new RevenueCalculator();
	       System.out.printf("Total revenue: %.2f", b.calculateRevenue());
	       System.out.println();

	        MovieShow.ShowPerformance c=new MovieShow.ShowPerformance();
	       System.out.println("Show performance: "+ c.evaluatePerformance(ticketSold));
	        
	    }
	}
	
class MovieShow
{
    public String movieName;
    public int ticketSold;
    public double ticketPrice;
    public MovieShow( String movieName,int ticketSold,double ticketPrice)
    {
        this.movieName=movieName;
        this.ticketSold=ticketSold;
        this.ticketPrice=ticketPrice;
    }

    class RevenueCalculator
    {
        public double calculateRevenue()
        {
            return ticketSold*ticketPrice;
        }
    }
    static class ShowPerformance
    {
      public  static String evaluatePerformance(int ticketsSold)
        {
            if(ticketsSold<50)
            {
                return "Poor Response";
            }
            else if(ticketsSold>50 && ticketsSold<149)
            {
                return "Average Response";
            }
            else{
                return "Blockbuster Response";
            }
        }
    }
}
