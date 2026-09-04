package ArrayProgram;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int [] a= new int[size];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int odd=0;
		int even=0;
		for(int e :a)
		{
			if(e%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("Count of even elements : "+even);
		System.out.println("Count of odd elements : "+odd);
	}

}
