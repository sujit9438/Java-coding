package StringProgram;

import java.util.Arrays;
import java.util.Scanner;

public class SortTheGivenStringArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		
		String [] a=new String[size];
		sc.nextLine();
		System.out.println("Enter array elements one by one : ");
		
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextLine();
		}
		for(int i=1;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j].compareTo(a[j+1])>0)
				{
					String temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));		
	}

}
