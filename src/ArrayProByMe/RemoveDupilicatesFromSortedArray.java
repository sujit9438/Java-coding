package ArrayProByMe;

import java.util.Scanner;

public class RemoveDupilicatesFromSortedArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Arrays Size");
		int size=sc.nextInt();
		int [] a=new int[size];
		System.out.println("Enter Arrays Elements One By One");
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
		}
	}

}
