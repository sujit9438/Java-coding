package standerdJava;
import java.util.Scanner;
public class gradeMark {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter mark");
		int mark= sc.nextInt();
		if(mark>=90&&mark<=100) 
		{
			System.out.println("A+");
			
		}else if(mark>80&&mark<89) 
		{
			System.out.println("A");
		}
		else if(mark>=70&&mark<=79) 
		{
			System.out.println("B");
		}
		else if(mark>=60&&mark<=69) 
		{
			System.out.println("C");
		}
		else if(mark>=50&&mark<=59) 
		{
			System.out.println("D");
		}
		else if(mark>=35&&mark<=49) 
		{
			System.out.println("E");
		}
		else if(mark>=0&&mark<=34) 
		{
			System.out.println("F");
		}
		else 
		{
			System.out.println("Enter valided input");
		}
	}

}
