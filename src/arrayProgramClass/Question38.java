package arrayProgramClass;

import java.util.Scanner;

public class Question38 {

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
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]>a[j] && a[i] -a[j] <min)
				{
					min=a[i]-a[j];
				}
				else if(a[i] <a[j] && a[j] - a[i]<min)
				{
					min=a[j]-a[i];
				}
				
//				if(Math.abs(a[i]-a[j]<min))
//				{
//					min=(Math.abs(a[i]-a[j]);
//				}
			}
		}
		System.out.println("Minimum difference is : "+min);
	}

}
