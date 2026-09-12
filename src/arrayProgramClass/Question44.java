package arrayProgramClass;

import java.util.Arrays;
import java.util.Scanner;

public class Question44 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an Array");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.println("Enter values of an Array");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter size1 of an Array");
        int size1 = sc.nextInt();

        int[] b = new int[size1];

        System.out.println("Enter values of an Array");

        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        
        if(Arrays.equals(a, b))
        {
        	System.out.println("Arrays are equal");
        }
        else
        {
        	System.out.println("Arrays are not equals");
        }
        

}
}
