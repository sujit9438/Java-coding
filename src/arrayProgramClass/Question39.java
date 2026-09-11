package arrayProgramClass;

import java.util.Scanner;

public class Question39 {

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
		for(int i=0;i<a.length;i++)
		{
			boolean isPreviouslyPresent=false;
			for(int j=0;j<i-1;j++)
			{
				if(a[i]==a[j])
				{
					isPreviouslyPresent=true;
					break;
				}
			}
			if(isPreviouslyPresent == false)
			{
				int count=0;
				for(int j=0;j<a.length;j++)
				{
					if(a[j]==a[i])
					{
						count++;
					}
				}
				System.out.println(a[i]+" is repeated "+count+" times");
			}
			
		}
	}

}
