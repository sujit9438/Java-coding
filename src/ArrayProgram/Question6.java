package ArrayProgram;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int [] a= new int[size];
		
		System.out.println(" Enter values ");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int smallest=a[0];
		for(int e: a)
		{
			if(e<smallest)
			{
				smallest=e;
			}
		}
		System.out.println("Smallest element is : "+smallest);
	}

}
