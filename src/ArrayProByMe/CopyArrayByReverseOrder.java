package ArrayProByMe;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArrayByReverseOrder {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array size");
		int size=sc.nextInt();
		int [] a= new int[size];
		System.out.println("Enter Array Element 1 by 1");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int []b= new int[size];
//		int x=0;
//		int y=a.length-1;
//		while(x<y)
//		{
//			int temp=a[x];
//			 a[x]=a[y];
//			 a[y]=temp;
//			 x++;
//			 y--;
//			
//		}
//		for(int i=0;i<a.length;i++)
//		{
//			b[i]=a[i];
//		}
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[a.length-1-i];
		}
		System.out.println(Arrays.toString(b));
	}

}
