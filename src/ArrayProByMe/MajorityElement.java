package ArrayProByMe;

import java.util.Scanner;

public class MajorityElement {

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
		int majority=-1;
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i] == a[j])
				{
					count++;
				}
			}
			if(count> a.length/2)
			{
				majority=a[i];
				break;
			}
		}
		if(majority !=-1)
		{
			System.out.println("Majority Element is : "+majority);
		}
		else
		{
			System.out.println("No Majority Element");
		}
		
	}

}
