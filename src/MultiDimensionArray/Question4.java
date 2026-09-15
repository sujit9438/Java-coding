package MultiDimensionArray;

import java.util.Scanner;

public class Question4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows :");
		int rows=sc.nextInt();
		System.out.println("Enter number of column : ");
		int column=sc.nextInt();
		
		int [][]a =new int[rows][column];
		
		System.out.println("Enter the matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("given matrix is: ");
		 for (int i = 0; i < a.length; i++) 
	        {
	            for (int j = 0; j < a[i].length; j++) 
	            {
	                System.out.print(a[i][j] + " ");
	            }
	            System.out.println();
	        }
	}
}
