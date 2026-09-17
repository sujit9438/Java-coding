package MultiDimensionArray;

import java.util.Scanner;

public class MultipicationOfMatrix {

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
        int [][]c=new int[a.length][b.length];
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a.length; j++) 
            {
            	int sum=0;
                for(int k=0;k<a.length;k++)
                {
                	sum=sum+a[i][k]*b[k][j];
                }
                c[i][j]=sum;
            }
        }
        System.out.println("Matrix is : ");
        for (int i = 0; i < c.length; i++) 
        {
            for (int j = 0; j < c[i].length; j++) 
            {
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }
        
	}

}
