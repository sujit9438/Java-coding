package ArrayProByMe;

import java.util.Scanner;

public class TwoSumEqualToTarget {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Size");
		int size=sc.nextInt();
		
		int [] a= new int[size];
		System.out.println("Enter Array Element One by One");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
	
		}
		System.out.println("Enter your Target");
		int target=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]+a[i]==target)
				{
					System.out.println(a[j]+" + "+a[i]+" = "+target);
				}
			}
		}
	}

}
