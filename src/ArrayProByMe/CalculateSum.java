package ArrayProByMe;

import java.util.Scanner;

public class CalculateSum {

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
		int sum=0;
		for(int b : a)
		{
			sum+=b;
		}
		System.out.println("Sum of Array is : "+sum);
	}

}
