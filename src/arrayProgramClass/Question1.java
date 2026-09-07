package arrayProgramClass;

import java.util.Arrays;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size =sc.nextInt();
		String [] a= new String[size];
		System.out.println("Enter array elements one by one : ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextLine();
		}
		System.out.println("Given array is "+Arrays.toString(a));
	}

}
