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
		System.out.println("==================================");
		System.out.println("Enter 1 for getting details of the book by author");
		System.out.println("Enter 2 for getting details of the book published after a year ");
		System.out.println("Enter 3 for getting average price ");
		System.out.println("===================================");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1->
			{
				sc.nextLine();
				System.out.println("Enter the author name ");
				String authorName=sc.nextLine();
				BooksByAuthor(authorName);
			}
			case 2->
			{
				System.out.println("Enter a year ");
				int year=sc.nextInt();
				booksPublishAfterCertaimYear(year);
			}
			case 3->
			{
				avgPriceOfBooks();
			}
			default->
			{
				System.out.println("Enter a valid choice ");
			}
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
	public static void avgPriceOfBooks()
	{
		int sum=0;
		for(Book b:a)
		{
			sum+=b.price;
		}
		System.out.println("Average price : "+(sum/a.length));
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



