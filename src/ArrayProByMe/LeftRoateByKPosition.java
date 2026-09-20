package ArrayProByMe;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRoateByKPosition {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int [] a= new int[size];
		System.out.println("Enter Arrays Element One By One");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter Rotate Time");
		int k=sc.nextInt();
		for(int i=1;i<=k;i++)
		{
			int temp=a[0];
			for(int j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
