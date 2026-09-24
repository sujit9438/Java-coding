package arrayProgramClass;

import java.util.Scanner;

public class ArrayOfReference 
{
	static Book a[];
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of books");
		int size=sc.nextInt();
		a=new Book[size];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter authoreName, title, price, publishedYear of Book : "+(i+1));
			String authoreName=IO.readln();
			String title=IO.readln();
			double price=Double.parseDouble(IO.readln());
			int publishedYear=Integer.parseInt(IO.readln());
			a[i] = new Book(authoreName,title,price,publishedYear);
			 
		}
//		System.out.println("Available books are : ");
//		for(Book b:a)
//		{
//			b.displayDetails();
//		}
	}
	public static void BooksByAuthor(String authorName)
	{
		for(Book b:a)
		{
			if(authorName.equals(b.authoreName))
			{
				b.displayDetails();
				System.out.println("============================");
			}
		}
	}
	public static void booksPublishAfterCertaimYear(int year)
	{
		for(Book b:a)
		{
			if(b.publishedYear>year)
			{
				b.displayDetails();
				System.out.println("===============================");
			}
		}
	}

}
class Book
{
	public String authoreName;
	public String title;
	public double price;
	public int publishedYear;
	public Book(String authoreName, String title, double price, int publishedYear)
	{
		this.authoreName = authoreName;
		this.title = title;
		this.price = price;
		this.publishedYear = publishedYear;
	}
	public void displayDetails()
	{
		System.out.println("Title of the book : "+title);
		System.out.println("Author Name :"+authoreName);
		System.out.println("Book Price : "+price);
		System.out.println("Book Publish Year : "+publishedYear);
	}
	
}



