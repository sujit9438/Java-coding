package EncapsulationPracticQuestion;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int productId=sc.nextInt();
		sc.nextLine();
		String productName=sc.nextLine();
		double price=sc.nextDouble();
		double discount=sc.nextDouble();
		
		Product9 ob = new Product9();
		
		ob.setProductId(productId);
		ob.setProductName(productName);
		ob.setPrice(price);
		ob.applyDiscount(discount);
		
		System.out.println("ProductID : "+ob.getProductId());
		System.out.println("Product Name : "+ob.getProductName());
		System.out.println("Price : "+ob.getPrice());
		
		
		
	}

}
class Product9
{
	private int productId;
	private String productName;
	private double price;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) 
	{
		if(productId>0)
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) 
	{
		if(price>=0)
		this.price = price;
	}
	void applyDiscount(double percentage)
	{
		double discount=price*percentage/100;
		double newPrice=price-discount;
	     this.price=newPrice;
	}
	
	
}
