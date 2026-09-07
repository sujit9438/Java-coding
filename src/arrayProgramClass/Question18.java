package arrayProgramClass;

import java.util.Scanner;

public class Question18 {

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
		System.out.println("Enter target");
		int target=sc.nextInt();
		boolean present=false;
		int start=0;
		int end =a.length-1;
		while(start<=end)
		{
			int midIndex = (start+end)/2;
			if(a[midIndex]==target)
			{
				present=true;
				break;
			}
			if(target > a[midIndex])
			{
				start=midIndex+1;
			}
			else
			{
				end=midIndex-1;
			}
		}
		if(present)
		{
			System.out.println(target+" is present in the array");
		}
		else
		{
			System.out.println(target+" is not  present in the array");
		}
	}

}
