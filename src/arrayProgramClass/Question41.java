package arrayProgramClass;

import java.util.Scanner;

public class Question41 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an Array");
		int size=sc.nextInt();
		int [] a= new int[size];
		
		System.out.println("Enter values of an Array ");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int n=a[a.length-1];
		int totalSum=(n*(n+1))/2;
		
		int arrySum=0;
		for(int b:a)
		{
			arrySum+=b;
		}
		if(arrySum==totalSum)
		{
			System.out.println("No element element");
		}
		else
		{
			System.out.println("Missing element = "+(totalSum-arrySum));
		}
		
	}

}
