package arrayProgramClass;

import java.util.Scanner;

public class Question37 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of ana Array");
		int size=sc.nextInt();
		int [] a= new int[size];
		
		System.out.println("Enter values of an Array ");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==num)
				{
					System.out.println("element is "+a[i]+" + "+a[j]+" = "+num);
				}
			}
		}
	}

}
