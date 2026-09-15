package ArrayProByMe;

import java.util.Scanner;

public class FindMaximumDifference {

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
		int maxDiff=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int diff=a[j] - a[i];
				if(diff> maxDiff)
				{
					maxDiff=diff;
				}
			}
		}
		System.out.println("Maximum Difference is : "+maxDiff);
	}

}
