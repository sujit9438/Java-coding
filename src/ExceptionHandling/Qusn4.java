package ExceptionHandling;

import java.util.Scanner;

public class Qusn4 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String [] product=new String[4];
		System.out.println("Enter product details");
		for(int i=0;i<product.length;i++)
		{
			product[i]=sc.next();
		}
		int index=sc.nextInt();
		ProductCatLog a= new ProductCatLog(product);
		try {
			a.displayProduct(index);
		} catch (InvalidProductIndexException e) 
		{
			System.out.println(e.getMessage());
		}
	}

}
class ProductCatLog
{
	private String [] product;

	public ProductCatLog(String[] product) 
	{
		
		this.product = product;
	}
	public void displayProduct(int index) throws InvalidProductIndexException
	{
		if(index<0 || index>3)
		{
			throw new InvalidProductIndexException("Invalid product index.");
		}
		else
		{
			System.out.println("Product name : "+product[index]);
		}
	}
	
}
class InvalidProductIndexException extends Exception
{

	public InvalidProductIndexException(String message) {
		super(message);
	}
	
}
