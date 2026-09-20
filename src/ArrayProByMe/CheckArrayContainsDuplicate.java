package ArrayProByMe;

import java.util.Scanner;

public class CheckArrayContainsDuplicate {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Arrays size");
		int size=sc.nextInt();
		int [] a= new int[size];
		System.out.println("Enter Arrays element One By One");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int count=0;
		outer:
		for(int i=0;i<a.length;i++)
		{
			inner:
			for(int j=1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					break outer;
				}
			}
		}
		if(count==1)
		{
			System.out.println("Array Contains Duplicate");
		}
		else
		{
			System.out.println("Array dont contains Duplicate");
		}
	}

}
