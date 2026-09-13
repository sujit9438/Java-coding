package ArrayProByMe;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray 
{
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Size");
		int size=sc.nextInt();
		int [] a= new int[size];
		System.out.println("Enter Array Elements One By One");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int left=0;
		int right=a.length-1;
		while(left<right)
		{
			int temp=a[left];
			a[left]	=a[right];
			a[right]=temp;
			left++;
			right--;
		}
		System.out.println("Reverse Element is : "+Arrays.toString(a));
	}
}
