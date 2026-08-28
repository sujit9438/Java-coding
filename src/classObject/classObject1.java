package classObject;

import java.util.Scanner;

public class classObject1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter bookname,author name,price");
		String bookName=sc.nextLine();
		String authorName=sc.nextLine();
		double price=sc.nextDouble();
		Book b1=new Book(bookName,authorName,price);
		b1.displayBookInfo();
		b1.issueBook();
		
	}

}
class Book
{//declare static and non-static variables
	public String bookName;
	public String authorName;
	public double price;
	//initialize the non-static variable with constructor
	public Book(String bookName, String authorName, double price) 
	{

		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
	}
	//write any methods required
	public void displayBookInfo()
	{
		System.out.println("Book name :"+bookName);
		System.out.println("author name :"+authorName);
		System.out.println("price :"+price);
	}
	public void issueBook()
	{
		System.out.println("Book issued successfully :"+bookName);
	}
	
	
}
