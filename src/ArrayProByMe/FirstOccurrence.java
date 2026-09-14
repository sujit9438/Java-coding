package ArrayProByMe;

import java.util.Scanner;

public class FirstOccurrence {

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
		System.out.println("Enter a target");
		int target=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==target)
			{
				System.err.println(" First Occurrence is "+i);
				break;
			}
		}
	}

}
