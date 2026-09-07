package arrayProgramClass;

import java.util.Scanner;

public class Question19 {

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
		boolean repeated=false;
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[j] == a[i])
				{
					count++;
				}
				
			}
			if(count>1)
			{
				repeated=true;
				System.out.println("First repeated element is : "+a[i]);
				break;
			}
			if(repeated==false)
			{
				System.out.println("No element is repeated");
			}
		}
	}

}
