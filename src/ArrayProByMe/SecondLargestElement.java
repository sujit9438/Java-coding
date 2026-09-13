package ArrayProByMe;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Size");
		int size=sc.nextInt();
		
		int [] a= new int[size];
		System.out.println("Enter Array Element One by One");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
	
		}
		Arrays.sort(a);
		for(int i=1;i<a.length;i++)
		{
			if(a[i] !=a[0])
			{
				System.out.println("Second Largest Element is : "+a[i]);
				break;
			}
		}
	}

}
