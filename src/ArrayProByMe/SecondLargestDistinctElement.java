package ArrayProByMe;

import java.util.Scanner;

public class SecondLargestDistinctElement {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Arrays Size");
		int size=sc.nextInt();
		System.out.println("Enter Arrays Element One By One");
		int [] a= new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				secondMax=max;
				max=a[i];
			}
			else if(a[i]!=max && a[i]>secondMax)
			{
				secondMax=a[i];
			}
		}
		System.out.println("Second Largest Element is : "+secondMax);
	}

}
