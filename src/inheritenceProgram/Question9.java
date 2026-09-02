package inheritenceProgram;
import java.util.Scanner;
public class Question9 
{
	
	    public static void main(String[] args) {
	        // Write your code here
	        Scanner sc = new Scanner(System.in);
	        String brand=sc.nextLine();
	        String os=sc.nextLine();
	        String gpu=sc.nextLine();
	        int battery=sc.nextInt();

	        GamingPhone ob= new GamingPhone(brand,os,gpu,battery);

	        ob.display();

	        
	    }
	}
	class Mobile
	{
	    public String brand;
	    public Mobile(String brand)
	    {
	        this.brand=brand;
	    }
	}
	class SmartPhone extends Mobile
	{
	    public String os;
	    public SmartPhone(String brand,String os)
	    {
	        super(brand);
	        this.os=os;
	    }
	}
	class GamingPhone extends SmartPhone
	{
	    public String gpu;
	    public int battery;
	    public GamingPhone(String brand,String os,String gpu,int battery)
	    {
	        super(brand,os);
	        this.gpu=gpu;
	        this.battery=battery;
	    }
	    public void display()
	    {
	        System.out.println("GamingPhone Brand: "+brand);
	        System.out.println("Operating System: "+os);
	        System.out.println("GPU: "+gpu);
	        System.out.println("Battery: "+battery+" mAh");
	    }

}
