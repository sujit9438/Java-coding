package ArrayProByMe;

import java.util.Arrays;
import java.util.Scanner;

public class MoveAllNegativeNumber {

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
		int []result=new int[a.length];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				result[index]=a[i];
				index++;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				result[index]=a[i];
				index++;
			}
		}
		System.out.println("Result is : "+Arrays.toString(result));
	}

}
