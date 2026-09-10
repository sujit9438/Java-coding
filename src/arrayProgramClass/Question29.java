package arrayProgramClass;

import java.util.Scanner;

public class Question29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of ana Array");
		int size=sc.nextInt();
		int [] a= new int[size];
		
		System.out.println("Enter values of an Array ");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			boolean previouslyPresent=false;
			for(int j=0;j<i-1;j++)
			{
				if(a[j]==a[i])
				{
					previouslyPresent=true;
					break;
				}
			}
			if(previouslyPresent==false)
			{
				count++;
			}
		}
		System.out.println("Count of distinct elements : "+count);
		
				
	}

}
