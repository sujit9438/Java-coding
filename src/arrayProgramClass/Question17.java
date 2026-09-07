package arrayProgramClass;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int [] a= new int[size];
		
		System.out.println("Enter values ");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		boolean flag=true;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]> a[i+1])
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Array is sorted");
		}
		else
		{
			System.out.println("Array is not sorted");
		}
	}

}
