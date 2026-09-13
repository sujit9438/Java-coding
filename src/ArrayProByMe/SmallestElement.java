package ArrayProByMe;

import java.util.Scanner;

public class SmallestElement 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Size");
		int size=sc.nextInt();
		
		int [] a= new int[size];
		System.out.println("Enter Array Element One by One");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
	
		}
		int smallest=a[0];
		for(int b : a)
		{
			if(b<smallest)
			{
				smallest=b;
			}
		}
		System.out.println("The Smallest Element is : "+smallest);
	}
}
