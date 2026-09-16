package MultiDimensionArray;

import java.util.Scanner;

public class FrequencyOfOddOrEven {

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
        int even=0;
        int odd=0;
        		
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a[i].length; j++) 
            {
                if(a[i][j]%2==0)
                {
                	even++;
                }
                else
                {
                	odd++;
                }
            }
        }
        System.out.println("Even Number"+even);
        System.out.println("Odd number"+odd);
        
	}

}
