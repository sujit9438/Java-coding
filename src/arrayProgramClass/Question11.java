package arrayProgramClass;

import java.util.Scanner;

public class Question11 {

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
		System.out.println("Enter element to search");
		int target=sc.nextInt();
		boolean found=false;
		for(int e : a)
		{
			if(e==target)
			{
				found=true;
				break;
			}
		}
		if(found == true)
		{
			System.out.println("Array contains the given target");
		}
		else
		{
			System.out.println("Array not contains the given target");
		}
	}

}
