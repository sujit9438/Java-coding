package arrayProgramClass;

import java.util.Scanner;

public class Question31 {

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
		int maxSum=Integer.MIN_VALUE;
		System.out.println("Sub arrays are");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				int sum=0;
				for(int m=i;m<=j;m++)
				{
					System.out.print(a[m]+" ");
					sum=sum+a[m];
					
				}
				System.out.println(" = "+sum);
				if(sum>maxSum)
				{
					maxSum=sum;
				}

			}
		}
		System.out.println("Max subarray is : "+maxSum);
		
	}

}
