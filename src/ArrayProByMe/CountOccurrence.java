package ArrayProByMe;

import java.util.Scanner;

public class CountOccurrence {

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
		System.out.println("Enter a target");
		int target =sc.nextInt();
		
		int count=0;
		for( int b: a)
		{
			if(b==target)
			{
				count++;
			}
		}
		System.out.println( target+" is repected "+count+" times");
	}

}
