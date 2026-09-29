package MultiDimensionArray;

import java.util.Scanner;

public class FindLargestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Inner Array Size");
		int size=sc.nextInt();
		System.out.println("Enter Outer Array Size");
		int size2=sc.nextInt();
		int [][] a= new int[size][size2];
		System.out.println("Enter element one by one");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
			}
		}
		System.out.println("Max value is: "+max);
	}

}
