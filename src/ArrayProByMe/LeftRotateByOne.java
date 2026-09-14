package ArrayProByMe;

import java.io.Closeable;
import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateByOne {

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
		System.out.println("Enter rotation times");
		int k=sc.nextInt();
		for(int i=1;i<=k;i++)
		{
			int left=a[0];
			for(int j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			a[a.length-1]=left;
		}
		System.out.println(Arrays.toString(a));
		
	}

}
