package MultiDimensionArray;

import java.util.Scanner;

public class SumOfEachRow {

	public static void main(String[] args) 
	{
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
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a[i].length;j++)
			{
				sum+=a[j][i];
			}
			System.out.println("colume "+(i+1)+" = "+sum);
		}
	}

}
