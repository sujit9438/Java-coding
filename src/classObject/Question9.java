package classObject;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Details");
		String n=sc.nextLine();
		double p=sc.nextDouble();
		double q=sc.nextDouble();
		Product a=new Product(n,p,q);
		a.displayBill();
	}

}
class Product
{
	public String name;
	public double price;
	public double quantity;
	public Product(String name, double price, double quantity) {
		
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	double calculateBill()
	{
		return price*quantity;
	}
	void displayBill()
	{
		System.out.println("Product Nmae : "+name);
		System.out.println("Product Price : "+price);
		System.out.println("Product Quantity : "+quantity);
		System.out.println("Total Bill : "+calculateBill());
	}
	
}
