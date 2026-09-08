package arrayProgramClass;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of ana Array");
		int size=sc.nextInt();
		int [] a= new int[size];
		
		System.out.println("Enter values of an Array ");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		boolean repeated=false;
		for(int i=0;i<=a.length;i++)
		{
			boolean present=false;
			for(int j=0;j<=i-1;j++)
			{
				if(a[j] ==a[i]);
				{
					present=true;
					break;
				}
				
			}
			if(present==true)
			{
				repeated=true;
			System.out.println("First repected element :"+a[i]);
			break;
			}
			
		}
		if(repeated==false)
		{
			System.out.println("No aaray elements are repected");
		}
		
	}

}
