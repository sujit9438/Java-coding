package MultiDimensionArray;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) 
	{
				Scanner sc = new Scanner(System.in);

		        System.out.println("Enter Outer arrays size");
		        int outerSize = sc.nextInt();

		        int[][] a = new int[outerSize][];

		        System.out.println("Enter 2-d arrays element one by one");

		        for (int i = 0; i < a.length; i++) 
		        {
		        	 System.out.println("Enter "+(i+1)+" inner arrays size");
				        int innerSize = sc.nextInt();
				        a[i]=new int[innerSize];
				        System.out.println("Enter "+(i+1)+" inner array element one by one");
				        
		            for (int j = 0; j < a[i].length; j++) 
		            {
		                a[i][j] = sc.nextInt();
		            }
		        }

		        System.out.println("\nGiven 2d jagged array is : ");

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
