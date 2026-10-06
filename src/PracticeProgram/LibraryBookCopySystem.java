package PracticeProgram;
import java.util.Scanner;

public class LibraryBookCopySystem 
{
	public static void main(String[] args) throws CloneNotSupportedException
    {
        Scanner sc = new Scanner(System.in);
        String bookId=sc.nextLine();
        String title=sc.nextLine();
        String author=sc.nextLine();
        double price=sc.nextDouble();
        if(bookId.length()<3 || title.length()<2||author.length()<3||price<0)
        {
            System.out.println("Error: Invalid book details");
            System.exit(0);
        }
        Book a=new Book(bookId,title,author,price);

        Book b=a.clone();
        b.price=b.price+50;
        System.out.println("Original Book: "+a.bookId+" "+a.title+" "+a.author+" "+a.price);
        System.out.println("Cloned Book: "+b.bookId+" "+b.title+" "+b.author+" "+b.price);
    }
}
class Book implements Cloneable
{
    String bookId;
    String title;
    String author;
    double price;
    Book(String bookId,String title,String author,double price)
    {
        this.bookId=bookId;
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public Book clone() throws CloneNotSupportedException
    {
        return (Book)super.clone();
    }
}
