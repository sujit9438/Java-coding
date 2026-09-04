package ArrayProgram;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int [] a= new int[size];
		
		System.out.println(" Enter values ");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int largest =a[0];
		for(int e :a)
		{
			if(e>largest)
			{
				largest=e;
			}
		}
		System.out.println("Largest number is : "+largest);
	}

}
