package arrayProgramClass;

import java.util.Scanner;

public class Question32 {

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
		System.out.println("Enter the target");
		int target=sc.nextInt();
		
		boolean result =false;
		
		int minIndex=0;
		int maxIndax=0;
		outer:
		for(int i=0;i<a.length;i++)
		{
			inner:
			for(int j=i;j<a.length;j++)
			{
				int sum=0;
				for(int m=i;m<=j;m++)
				{
					sum=sum+a[m];
					
				}				
				if(sum==target)
				{
					result=true;
					minIndex=i;
					maxIndax=j;
					break outer;
				}
			}
		}
		if(result== true)
		{
			for(int x= minIndex;x<=maxIndax;x++)
			{
				System.out.print(a[x]+" ");
			}
		}
		else
		{
			System.out.println("There is no sub-array which is given "+target);
		}
		
	}

}
