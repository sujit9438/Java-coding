package arrayProgramClass;

import java.util.Scanner;

public class ArrayReference3 {

	static Product [] a;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of product");
		int size=sc.nextInt();
		a=new Product[size];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter ProductID, ProductName, Category , price : "+(i+1));
			int productId=Integer.parseInt(IO.readln());
			String productName=IO.readln();
			String category=IO.readln();
			double price=Double.parseDouble(IO.readln());
			a[i] = new Product(productId, productName, category, price);
			 
		}
		System.out.println("===========================================");
		System.out.println("Enter 1 for printing the details product belong to the given Category");
		System.out.println("Enter 2 for printing the details product who are having price greater than given price");
		System.out.println("Enter 3 for Average price ");
		System.out.println("=============================================");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1->
		{
			sc.nextLine();
			System.out.println("Enter product category");
			String cate=sc.nextLine();
			productBelongsToGivenCategory(cate);
		}
		case 2->
		{
			System.out.println("Enter the target price");
			double price=sc.nextDouble();
			productPrice(price);
		}
		case 3->
		{
			avgPrice();
		}
		default ->
		{
			System.out.println("Enter valid choice ");
		}
		}
	}
	public static void productBelongsToGivenCategory(String category)
	{
		for(Product b:a)
		{
			if(category.equals(b.category))
			{
				b.displayDetails();
			}
		}
	}
	public static void productPrice(double price)
	{
		for(Product b:a)
		{
			if(b.price>price)
			{
				b.displayDetails();
			}
		}
	}
	public static void avgPrice()
	{
		double sum=0;
		for(Product b:a)
		{
			sum+=b.price;
					
		}
		System.out.println("Average Price :-"+(sum/a.length));
	}

}
class Product
{
	public int productId;
	public String productName;
	public String category;
	public double price;
	public Product(int productId, String productName, String category, double price) {
		
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.price = price;
	}
	public void displayDetails()
	{
		System.out.println("Product ID :- "+productId);
		System.out.println("Product Name :- "+productName);
		System.out.println("Product Categoty :-"+category);
		System.out.println("Product Price :-"+price);
	}
	
}
