package MultiDimensionArray;

import java.util.Scanner;

public abstract class SumOfEachRowAndColumn {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows of first:");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns of first:");
        int column = sc.nextInt();

        int[][] a = new int[rows][column];

        System.out.println("Enter the First matrix:");
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a[i].length; j++) 
            {
                a[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < a.length; i++) 
        {
        	int sum=0;
            for (int j = 0; j < a[i].length; j++) 
            {
                sum+=a[i][j];
            }
            System.out.println("Sum of "+(i+1)+" row : "+sum);
        }
        for (int i = 0; i < a.length; i++) 
        {
        	int sum=0;
            for (int j = 0; j < a[i].length; j++) 
            {
                sum+=a[j][i];
            }
            System.out.println("Sum of "+(i+1)+" column : "+sum);
        }
        
	}

}
