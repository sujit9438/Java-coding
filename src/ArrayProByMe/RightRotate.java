package ArrayProByMe;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotate {

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
		System.out.println("Enter rotation Times");
		int k=sc.nextInt();
		for(int i=1;i<=k;i++)
		{
			int right =a[ a.length-1];
			for(int j = a.length-1 ; j> 0 ; j--)
			{
				a[j]=a[j-1];
			}
			a[0]=right;
		}
		System.out.println(Arrays.toString(a));
	}

}
