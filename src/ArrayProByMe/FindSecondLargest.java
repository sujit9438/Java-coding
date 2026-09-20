package ArrayProByMe;

import java.util.Arrays;
import java.util.Scanner;

  public class FindSecondLargest {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Arrays Size");
		int size=sc.nextInt();
		int [] a= new int[size];
		System.out.println("Enter Arrays Element One By One");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int [] b =new int[size];
		int k=0;
		for(int i=0;i<a.length;i++ )
		{
			if(a[i]!=0)
			{
				b[k]=a[i];
				k++;
			}
		}
		System.out.println(Arrays.toString(b));
	}

}
