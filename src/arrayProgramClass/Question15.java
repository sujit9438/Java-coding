package arrayProgramClass;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int [] a= new int[size];
		
		System.out.println("Enter values ");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		double sum=0;
		for(int v : a)
		{
			sum+=v;
		}
		System.out.println("Average is : "+(sum/a.length));
	}

}
