package ArrayProByMe;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIsSortedOrNot {

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
		boolean sorted=true;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]> a[i+1])
			{
				sorted=false;
				break;
			}
		}
		System.out.println(Arrays.toString(a)+" "+sorted );
		
	}

}
