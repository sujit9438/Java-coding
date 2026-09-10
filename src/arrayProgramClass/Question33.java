package arrayProgramClass;

import java.util.Arrays;
import java.util.Scanner;

public class Question33 {

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
		for(int cycle =0;cycle<=a.length-1;cycle++)
		{
			for(int i=0;i<=a.length-2;i++)
			{
				if(a[i+1]<a[i])
				{
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
