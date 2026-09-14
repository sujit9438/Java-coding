package ArrayProByMe;

import java.util.Scanner;

public class FindMissingNumber {

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
		int min=a[0];
		int max=a[0];
		for(int b : a)
		{
			if(b>max)
			{
				max=b;
			}
			if(b<min)
			{
				min=b;
			}
		}
		int xorArray=0;
		int xorExpected =0;
		for(int i=0;i<a.length;i++)
		{
			xorArray^=a[i];
		}
		for( int i= min;i<=max;i++)
		{
			xorExpected^=i;
		}
		int missingNumber=xorArray^xorExpected;
		System.out.println("Missing Number is : "+missingNumber);
				
	}

}
