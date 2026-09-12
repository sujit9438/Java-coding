package arrayProgramClass;

import java.util.Scanner;

public class Question42 {

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
        for(int i=0;i<a.length;i++)
        {
        	boolean isPresent=false;
        	for(int j=0;j<b.length;j++)
        	{
        		if(b[j]==a[i])
        		{
        			isPresent=true;
        			break;
        		}
        	}
        	if(isPresent)
        	{
        		System.out.println(a[i]);
        	}
        }
	}

}
