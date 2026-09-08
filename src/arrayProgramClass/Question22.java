package arrayProgramClass;

import java.util.Arrays;
import java.util.Scanner;

public class Question22 {

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
		System.out.println("Enter rotation time : ");
		int k=sc.nextInt();
		for(int j=1;j<=k;j++)
		{
			int temp=a[0];
			for(int i=1;i<a.length;i++)
			{
				a[i-1]=a[i];
			}
			a[a.length-1]=temp;
		}
		System.out.println("Array after "+k+" left rotations : "+Arrays.toString(a));
	}

}
