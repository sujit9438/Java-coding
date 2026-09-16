package MultiDimensionArray;

import java.util.Scanner;

public class WhetherTwoMatrixEqualOrNot {

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

        System.out.println("Enter number of rows of second:");
        int rows1 = sc.nextInt();

        System.out.println("Enter number of columns of second:");
        int column1 = sc.nextInt();

        int[][] b = new int[rows1][column1];

        System.out.println("Enter the Second matrix:");
        for (int i = 0; i < b.length; i++) 
        {
            for (int j = 0; j < b[i].length; j++) 
            {
                b[i][j] = sc.nextInt();
            }
        }
        boolean equal=true;
        outer:
        for (int i = 0; i < a.length; i++) 
        {
        	inner:
            for (int j = 0; j < a[i].length; j++) 
            {
               if( a[i][j] != b[i][j]) 
               {
            	   equal=false;
            	   break outer; 
               }
            }
        }
        if(equal)
        {
        	System.out.println("Matrix are equal");
        }
        else
        {
        	System.out.println("Matrix are not equal");
        }
	}

}
