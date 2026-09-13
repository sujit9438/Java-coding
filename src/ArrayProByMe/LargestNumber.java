package ArrayProByMe;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Arrays Size");
		int size=sc.nextInt();
		
		int [] a=new int[size];
		
		System.out.println("Enter Arrays Elements One by One");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int largest=0;
		for(int b:a )
		{
			if(b>largest)
			{
				largest=b;
			}
		}
		System.out.println("Largest Element is : "+largest);
	}

}
