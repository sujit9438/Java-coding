package MultiDimensionArray;

import java.util.Scanner;

public class TransposedMatrix {

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
            for (int j = 0; j < a[i].length; j++) 
            {
                if(i<j)
                {
                	int temp=a[i][j];
                	a[i][j]=a[j][i];
                	a[j][i]=temp;
                }
                
            }
        }
        System.out.println("Given array is : ");
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a[i].length; j++) 
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
	}

}
