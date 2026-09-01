package EncapsulationPracticQuestion;
import java.util.Scanner;
public class Question1 
{

	    public static void main(String[] args) {
	        // Write your code here
	        Scanner sc = new Scanner(System.in);
	        String name=sc.nextLine();
	        double price=sc.nextDouble();
	        sc.nextLine();
	        String category=sc.nextLine();

	        Product a=new Product(name,price,category);
	        if(price<=0)
	        {
	            System.out.println("Invalid Price, Price should be greater than 0.");
	            return ;
	        }
	        a.displayDetails();
	        
	    }
	}
	class Product
	{
	    private String name;
	    private double price;
	    private String category;
	    public Product(String name,double price,String category)
	    {
	        
	        this.name=name;
	        this.price=price;
	        this.category=category;
	    }
	    public void displayDetails()
	    {
	      System.out.println("Product Details:");
	      System.out.println("Name : "+name);
	      System.out.println("Price : "+price);
	      System.out.println("Category : "+category);  
	    }
	    public String getName()
	    {  
	            return name;   
	    }
	    public double getPrice()
	    {
	        return price;
	    }
	    public String getCategory()
	    {
	        return category;
	    }
	
}
