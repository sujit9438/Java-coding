package ArrayProByMe;

import java.util.Scanner;

public class CountEvenAndOdd 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Size");
		int size=sc.nextInt();
		int [] a= new int[size];
		System.out.println("Enter Array Elements One By One");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int even=0;
		int odd=0;
		for(int b : a)
		{
			if(b%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("Even Element is : "+even);
		System.out.println("Odd Element is : "+odd);
	}
}
