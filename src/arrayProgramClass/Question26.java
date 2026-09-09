package arrayProgramClass;

import java.util.Arrays;
import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int [] a= new int[size];
		
		System.out.println("Enter Arrays values ");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if( a[i] < 0 )
			{
				int temp=a[i];
				a[i]=a[j];
				a[j++]=temp;
				
			}
		}
		System.out.println(Arrays.toString(a));
		
		
	}

}
