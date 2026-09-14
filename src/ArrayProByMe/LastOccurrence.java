package ArrayProByMe;

import java.util.Scanner;

public class LastOccurrence {

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
		System.out.println("Enter target element");
		int target=sc.nextInt();
		
		for(int i=a.length-1;i>=0;i--)
		{
			if(a[i]==target)
			{
				System.out.println("Last Occurrence is :"+i);
				break;
			}
		}
	}

}
