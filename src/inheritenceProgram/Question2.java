package inheritenceProgram;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Product name,price,quantity,,discount");
		String name=sc.nextLine();
		double price=sc.nextDouble();
		double quantity=sc.nextDouble();
		double discount=sc.nextDouble();
		DiscountProduct p=new DiscountProduct(name,price,quantity,discount);
		p.displayDetails();
		System.out.println("Final Amount:"+ p.calculateTotal());
	}

}
class Product
{
	//step:01-declare static and no-static variable
	public String productName;
	public double price;
	public double quantity;
	// step 2: initialize the variable with constructor 
	public Product(String productName, double price, double quantity) {
		
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	// step 3:create any method if required.
	public double calculateTotal()
	{
		return price*quantity;
	}
	public void displayDetails()
	{
		System.out.println("Product Name :"+productName);
		System.out.println("Product Price:"+price);
		System.out.println("product Quantity:"+quantity);
		System.out.println("Product Total:"+calculateTotal());
	}
	
	
}
class DiscountProduct extends Product
{
	public double discount;

	public DiscountProduct(String productName, double price, double quantity, double discount) {
		super(productName, price, quantity);
		this.discount = discount;
	}
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Product Discount :"+discount);
		
	}
	public double calculateTotal()
	{
		double total= super.calculateTotal();
		double finalAmount=total-(total*discount/100);
		return finalAmount;
	}
	
}
