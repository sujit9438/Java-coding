package MultiDimensionArray;

import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Outer arrays size");
        int size1 = sc.nextInt();

        System.out.println("Enter inner arrays size");
        int size = sc.nextInt();

        int[][] a = new int[size1][size];

        System.out.println("Enter 2-d arrays element one by one");

        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a[i].length; j++) 
            {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Given 2d array is : ");

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
