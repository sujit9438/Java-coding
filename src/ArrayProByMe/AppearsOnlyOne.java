package ArrayProByMe;

import java.util.Scanner;

public class AppearsOnlyOne {

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
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(a[i]);
			}
		}
	}

}
