package ArrayProByMe;

import java.util.Scanner;

public class CountPositiveOrNegative {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Size");
		int size=sc.nextInt();
		int [] a= new int[size];
		System.out.println("Enter Array Elements One By One");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int positive=0;
		int negative=0;
		int zero=0;
		for(int b: a)
		{
			if(b>0)
			{
				positive++;
			}
			else if(b<0)
			{
				negative++;
			}
			else
			{
				zero++;
			}
		}
		System.out.println("Positive : "+positive);
		System.out.println("Negative : "+negative);
		System.out.println("Zero : "+zero);
	}

}
