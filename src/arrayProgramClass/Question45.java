package arrayProgramClass;

import java.util.Arrays;
import java.util.Scanner;

public class Question45 {

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
        int [] c=new int[a.length+b.length];
        int index=0;
        	int x=0;
        	int y=0;
        	
        while(x<=a.length-1 && y<=b.length-1)
        {
        	if(a[x]<b[y])
        	{
        		c[index]=a[x];
        		x++;
        	}
        	else
        	{
        		c[index]=b[y];
        		y++;
        	}
        	index++;
        }
        while(x<=a.length-1)
        {
        	c[index]=a[x];
        	x++;
        	index++;
        }
        while(y<=b.length-1)
        {
        	c[index]=b[y];
        	y++;
        	index++;
        }
        System.out.println("Array is : "+Arrays.toString(c));
		
	}

}
