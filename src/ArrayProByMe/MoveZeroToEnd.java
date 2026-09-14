package ArrayProByMe;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroToEnd {

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
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				a[index]=a[i];
				index++;
			}
		}
		while(index<a.length)
		{
			a[index]=0;
			index++;
		}
		System.out.println(Arrays.toString(a));
	}

}
