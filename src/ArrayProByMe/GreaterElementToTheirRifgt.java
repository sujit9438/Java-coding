package ArrayProByMe;

import java.util.Scanner;

public class GreaterElementToTheirRifgt {

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
		for(int i=0;i<a.length;i++)
		{
			boolean greater=true;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<=a[j])
				{
					greater=false;
					break;
				}
			}
			if(greater)
			{
				System.out.println("Element are : "+a[i]);
			}
		}
	}

}
