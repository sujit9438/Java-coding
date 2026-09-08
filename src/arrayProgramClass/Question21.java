package arrayProgramClass;

import java.util.Scanner;

public class Question21 {

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
		 boolean noRepeated=false;
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==a[i])
				{
					count++;
				}
			}
			if(count==1)
			{
				noRepeated=true;
				System.out.println("the first non repeated element is:"+a[i]);
				break;
			}
			
		}
		if(noRepeated==false)
		{
			System.out.println("Their are no non repeated element");
		
		}
	}

}
