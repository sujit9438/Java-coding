package arrayProgramClass;

import java.util.Arrays;
import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) 
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter size");
		int size= ob.nextInt();
		int [] a= new int[size];
		
		System.out.println("Enter values ");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=ob.nextInt();
		}
		System.out.println("Result :"+Arrays.toString(reverse(a)));
	}
	public static int [] reverse(int [] a)
	{
		int x=0;
		int y=a.length-1;
		while(x<y)
		{
			int temp=a[x];
			a[x]=a[y];
			a[y]=temp;
			x++;
			y--;
		}
		return a;
		
	}

}
