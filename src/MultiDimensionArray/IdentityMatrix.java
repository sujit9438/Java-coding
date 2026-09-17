package MultiDimensionArray;

import java.util.Scanner;

public class IdentityMatrix {

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
        boolean isIdentityMatrix=true;
        outer:
        for (int i = 0; i < a.length; i++) 
        {
        	inner:
            for (int j = 0; j < a[i].length; j++) 
            {
                if((i==j && a[i][j]!=1) || (i!=j && a[i][j]!=0))
                {
                	isIdentityMatrix=false;
                	break outer;
                }
            }
        }
        if(isIdentityMatrix)
        {
        	System.out.println("Identity matrix");
        }
        else
        {
        	System.out.println("Not Identity matrix");
        }
	}

}
